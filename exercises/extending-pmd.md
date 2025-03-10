# Extending PMD

Use XPath to define a new rule for PMD to prevent complex code. The rule should detect the use of three or more nested `if` statements in Java programs so it can detect patterns like the following:

```Java
if (...) {
    ...
    if (...) {
        ...
        if (...) {
            ....
        }
    }

}
```
Notice that the nested `if`s may not be direct children of the outer `if`s. They may be written, for example, inside a `for` loop or any other statement.
Write below the XML definition of your rule.

You can find more information on extending PMD in the following link: https://pmd.github.io/latest/pmd_userdocs_extending_writing_rules_intro.html, as well as help for using `pmd-designer` [here](https://github.com/selabs-ur1/VV-TP2/blob/master/exercises/designer-help.md).

Use your rule with different projects and describe you findings below. See the [instructions](../sujet.md) for suggestions on the projects to use.

## Answer

Ajout de la régle :
```
 <rule name="NoMoreThreeIfs"
      language="java"
      message="3 Ifs imbriqués"
      class="net.sourceforge.pmd.lang.rule.XPathRule" >
    <description>
        3 Ifs imbriqués
    </description>
    <priority>3</priority>
    <properties>
        <property name="xpath">
            <value>
            <![CDATA[
            //IfStatement/Statement
            	/Block/BlockStatement/Statement
            	/IfStatement/Statement
            		/Block/BlockStatement/Statement
            		/IfStatement
            ]]>
            </value>
        </property>
    </properties>
 </rule>

```

Avec une classe TEST.java :

```

public class Affichage {
	public boolean test(){
		if(1>2){
			if(2>3){
				if(3>4){
					return true;
				
				}
			
			}
		
		
		}
	return false;
	}
}
```

Cela donne l'alerte : 
```
/home/cobald/Documents/VV/MiniBlogJ2E-master/src/TEST.java:6:	NoMoreThreeIfs:	3 Ifs imbriqués
```
