package fr.istic.vv;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.body.BodyDeclaration;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.ast.body.EnumDeclaration;
import com.github.javaparser.ast.body.FieldDeclaration;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.body.TypeDeclaration;
import com.github.javaparser.ast.body.VariableDeclarator;
import com.github.javaparser.ast.visitor.VoidVisitorWithDefaults;

public class NoGetterPrinter extends VoidVisitorWithDefaults<Void> {

	private BufferedWriter logs;
	private ArrayList<VariableDeclarator> listVariables = new ArrayList<VariableDeclarator>();
	
	public NoGetterPrinter() {
		File logFile = new File("Result.txt");
		
		try {
			this.logs = new BufferedWriter(new FileWriter(logFile));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
    @Override
    public void visit(CompilationUnit unit, Void arg) {
        for(TypeDeclaration<?> type : unit.getTypes()) {
            type.accept(this, null);
        }
        
       
        
        for(VariableDeclarator varDecl : listVariables) {
        	try {
				logs.write("\t"+varDecl.toString()+"\n");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }
        listVariables.clear();
        try {
			logs.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    public void visitTypeDeclaration(TypeDeclaration<?> declaration, Void arg) {
        if(!declaration.isPublic()) return;
        //System.out.println(declaration.getFullyQualifiedName().orElse("[Anonymous]"));
        // Write class name
        try {
			logs.write(declaration.getFullyQualifiedName().orElse("[Anonymous]")+ "\n");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        // Field Declaration
        for(FieldDeclaration field : declaration.getFields()) {
            field.accept(this, arg);
        }
        
        for(MethodDeclaration method : declaration.getMethods()) {
            method.accept(this, arg);
        }
        // Printing nested types in the top level
        for(BodyDeclaration<?> member : declaration.getMembers()) {
            if (member instanceof TypeDeclaration)
                member.accept(this, arg);
        }
    }

    @Override
    public void visit(ClassOrInterfaceDeclaration declaration, Void arg) {
        
    	visitTypeDeclaration(declaration, arg);
    }

    @Override
    public void visit(EnumDeclaration declaration, Void arg) {
        visitTypeDeclaration(declaration, arg);
    }

    @Override
    public void visit(MethodDeclaration declaration, Void arg) {
        if(!declaration.isPublic()) return;
        //System.out.println("  " + declaration.getDeclarationAsString(true, true));
    }

    
    @Override
    public void visit(FieldDeclaration declaration, Void arg){
        if(declaration.isPrivate()) {
            for(VariableDeclarator var : declaration.getVariables()){
                listVariables.add(var);
            }
        }
    }
    
}
