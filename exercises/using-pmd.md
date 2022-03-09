# Using PMD

Pick a Java project from Github (see the [instructions](../sujet.md) for suggestions). Run PMD on its source code using any ruleset. Describe below an issue found by PMD that you think should be solved (true positive) and include below the changes you would add to the source code. Describe below an issue found by PMD that is not worth solving (false negative). Explain why you would not solve this issue.

## Answer
Avec le projet personnel  : https://github.com/CoBaldUr/MiniBlogJ2E
```
 
 cobald@cobald-Inspiron-7520:~/Documents/VV/pmd-bin-6.43.0/bin$ bash run.sh pmd -d ../../MiniBlogJ2E-master/src/ -f text -R quickstart.xml
mars 09, 2022 3:03:38 PM net.sourceforge.pmd.PMD encourageToUseIncrementalAnalysis
AVERTISSEMENT: This analysis could be faster, please consider using Incremental Analysis: https://pmd.github.io/pmd-6.43.0/pmd_userdocs_incremental_analysis.html
/home/cobald/Documents/VV/MiniBlogJ2E-master/src/Affichage.java:2:	NoPackage:	All classes, interfaces, enums and annotations must belong to a named package
/home/cobald/Documents/VV/MiniBlogJ2E-master/src/cours/dbconnect/BaseMySQLDao.java:18:	CloseResource:	Ensure that resources like this Connection object are closed after use
/home/cobald/Documents/VV/MiniBlogJ2E-master/src/cours/dbconnect/BaseMySQLDao.java:19:	CloseResource:	Ensure that resources like this Statement object are closed after use
/home/cobald/Documents/VV/MiniBlogJ2E-master/src/cours/dbconnect/BaseMySQLDao.java:23:	CloseResource:	Ensure that resources like this ResultSet object are closed after use
/home/cobald/Documents/VV/MiniBlogJ2E-master/src/cours/dbconnect/BaseMySQLDao.java:31:	AvoidBranchingStatementAsLastInLoop:	Avoid using a branching statement as the last in a loop.
/home/cobald/Documents/VV/MiniBlogJ2E-master/src/cours/dbconnect/BaseMySQLDao.java:53:	LocalVariableNamingConventions:	The local variable name 'SQL' doesn't match '[a-z][a-zA-Z0-9]*'
/home/cobald/Documents/VV/MiniBlogJ2E-master/src/cours/dbconnect/BaseMySQLDao.java:56:	CloseResource:	Ensure that resources like this Connection object are closed after use
/home/cobald/Documents/VV/MiniBlogJ2E-master/src/cours/dbconnect/BaseMySQLDao.java:57:	CloseResource:	Ensure that resources like this PreparedStatement object are closed after use
/home/cobald/Documents/VV/MiniBlogJ2E-master/src/cours/dbconnect/BaseMySQLDao.java:92:	MethodNamingConventions:	The instance method name 'MD5' doesn't match '[a-z][a-zA-Z0-9]*'
/home/cobald/Documents/VV/MiniBlogJ2E-master/src/cours/dbconnect/BaseMySQLDao.java:97:	ForLoopCanBeForeach:	This for loop can be replaced by a foreach loop
/home/cobald/Documents/VV/MiniBlogJ2E-master/src/cours/dbconnect/BaseMySQLDao.java:101:	EmptyCatchBlock:	Avoid empty catch blocks
/home/cobald/Documents/VV/MiniBlogJ2E-master/src/cours/dbconnect/CreateAccount.java:25:	UnnecessaryConstructor:	Avoid unnecessary constructors - the compiler will generate these for you
/home/cobald/Documents/VV/MiniBlogJ2E-master/src/cours/dbconnect/CreateAccount.java:34:	CloseResource:	Ensure that resources like this PrintWriter object are closed after use
/home/cobald/Documents/VV/MiniBlogJ2E-master/src/cours/dbconnect/DbConnection.java:5:	UseUtilityClass:	All methods are static.  Consider using a utility class instead. Alternatively, you could add a private constructor or make the class abstract to silence this warning.
/home/cobald/Documents/VV/MiniBlogJ2E-master/src/cours/dbconnect/DbConnection.java:40:	NonThreadSafeSingleton:	Singleton is not thread safe
/home/cobald/Documents/VV/MiniBlogJ2E-master/src/cours/dbconnect/DbConnection.java:47:	IdenticalCatchBranches:	'catch' branch identical to 'ClassNotFoundException' branch
/home/cobald/Documents/VV/MiniBlogJ2E-master/src/cours/dbconnect/DbConnection.java:62:	NonThreadSafeSingleton:	Singleton is not thread safe
/home/cobald/Documents/VV/MiniBlogJ2E-master/src/cours/dbconnect/DiscoFilter.java:24:	UnnecessaryConstructor:	Avoid unnecessary constructors - the compiler will generate these for you
/home/cobald/Documents/VV/MiniBlogJ2E-master/src/cours/dbconnect/DiscoFilter.java:57:	ControlStatementBraces:	This statement should have braces
/home/cobald/Documents/VV/MiniBlogJ2E-master/src/cours/dbconnect/FilterModComm.java:23:	UnnecessaryConstructor:	Avoid unnecessary constructors - the compiler will generate these for you
/home/cobald/Documents/VV/MiniBlogJ2E-master/src/cours/dbconnect/FilterModPost.java:23:	UnnecessaryConstructor:	Avoid unnecessary constructors - the compiler will generate these for you
/home/cobald/Documents/VV/MiniBlogJ2E-master/src/cours/dbconnect/FiltreLogIn.java:24:	UnnecessaryConstructor:	Avoid unnecessary constructors - the compiler will generate these for you
/home/cobald/Documents/VV/MiniBlogJ2E-master/src/cours/dbconnect/LogIn.java:13:	UnnecessaryImport:	Unused import 'cours.dbconnect.model.User'
/home/cobald/Documents/VV/MiniBlogJ2E-master/src/cours/dbconnect/LogIn.java:15:	UnnecessaryImport:	Unused import 'java.util.List'
/home/cobald/Documents/VV/MiniBlogJ2E-master/src/cours/dbconnect/LogIn.java:35:	CloseResource:	Ensure that resources like this PrintWriter object are closed after use
/home/cobald/Documents/VV/MiniBlogJ2E-master/src/cours/dbconnect/LogIn.java:75:	UnusedLocalVariable:	Avoid unused local variables such as 'out'.
/home/cobald/Documents/VV/MiniBlogJ2E-master/src/cours/dbconnect/LogIn.java:75:	CloseResource:	Ensure that resources like this PrintWriter object are closed after use
/home/cobald/Documents/VV/MiniBlogJ2E-master/src/cours/dbconnect/LogIn.java:79:	UnusedLocalVariable:	Avoid unused local variables such as 'conn'.
/home/cobald/Documents/VV/MiniBlogJ2E-master/src/cours/dbconnect/ModCompte.java:13:	UnnecessaryImport:	Unused import 'cours.dbconnect.model.PagePrincipale'
/home/cobald/Documents/VV/MiniBlogJ2E-master/src/cours/dbconnect/ModCompte.java:24:	UnnecessaryConstructor:	Avoid unnecessary constructors - the compiler will generate these for you
/home/cobald/Documents/VV/MiniBlogJ2E-master/src/cours/dbconnect/ModCompte.java:41:	ControlStatementBraces:	This statement should have braces
/home/cobald/Documents/VV/MiniBlogJ2E-master/src/cours/dbconnect/ModCompte.java:44:	ControlStatementBraces:	This statement should have braces
/home/cobald/Documents/VV/MiniBlogJ2E-master/src/cours/dbconnect/ModCompte.java:57:	ControlStatementBraces:	This statement should have braces
/home/cobald/Documents/VV/MiniBlogJ2E-master/src/cours/dbconnect/ModFriend.java:21:	UnnecessaryConstructor:	Avoid unnecessary constructors - the compiler will generate these for you
/home/cobald/Documents/VV/MiniBlogJ2E-master/src/cours/dbconnect/ModFriend.java:43:	ControlStatementBraces:	This statement should have braces
/home/cobald/Documents/VV/MiniBlogJ2E-master/src/cours/dbconnect/ModFriend.java:49:	ControlStatementBraces:	This statement should have braces
/home/cobald/Documents/VV/MiniBlogJ2E-master/src/cours/dbconnect/UserMySQLDao.java:10:	UnnecessaryImport:	Unnecessary import from the current package 'cours.dbconnect.DbConnection'
/home/cobald/Documents/VV/MiniBlogJ2E-master/src/cours/dbconnect/UserMySQLDao.java:15:	UnnecessaryImport:	Unused import 'java.util.List'
/home/cobald/Documents/VV/MiniBlogJ2E-master/src/cours/dbconnect/UserMySQLDao.java:17:	UnnecessaryImport:	Unused import 'javax.servlet.http.HttpSession'
/home/cobald/Documents/VV/MiniBlogJ2E-master/src/cours/dbconnect/UserMySQLDao.java:29:	LooseCoupling:	Avoid using implementation types like 'ArrayList'; use the interface instead
/home/cobald/Documents/VV/MiniBlogJ2E-master/src/cours/dbconnect/UserMySQLDao.java:29:	LooseCoupling:	Avoid using implementation types like 'ArrayList'; use the interface instead
/home/cobald/Documents/VV/MiniBlogJ2E-master/src/cours/dbconnect/UserMySQLDao.java:33:	CloseResource:	Ensure that resources like this Connection object are closed after use
/home/cobald/Documents/VV/MiniBlogJ2E-master/src/cours/dbconnect/UserMySQLDao.java:34:	CloseResource:	Ensure that resources like this Statement object are closed after use
/home/cobald/Documents/VV/MiniBlogJ2E-master/src/cours/dbconnect/UserMySQLDao.java:44:	CloseResource:	Ensure that resources like this ResultSet object are closed after use
/home/cobald/Documents/VV/MiniBlogJ2E-master/src/cours/dbconnect/UserMySQLDao.java:72:	CloseResource:	Ensure that resources like this Connection object are closed after use
/home/cobald/Documents/VV/MiniBlogJ2E-master/src/cours/dbconnect/UserMySQLDao.java:73:	CloseResource:	Ensure that resources like this Statement object are closed after use
/home/cobald/Documents/VV/MiniBlogJ2E-master/src/cours/dbconnect/UserMySQLDao.java:77:	CloseResource:	Ensure that resources like this ResultSet object are closed after use
/home/cobald/Documents/VV/MiniBlogJ2E-master/src/cours/dbconnect/UserMySQLDao.java:103:	LooseCoupling:	Avoid using implementation types like 'ArrayList'; use the interface instead
/home/cobald/Documents/VV/MiniBlogJ2E-master/src/cours/dbconnect/UserMySQLDao.java:106:	CloseResource:	Ensure that resources like this Connection object are closed after use
/home/cobald/Documents/VV/MiniBlogJ2E-master/src/cours/dbconnect/UserMySQLDao.java:107:	CloseResource:	Ensure that resources like this Statement object are closed after use
/home/cobald/Documents/VV/MiniBlogJ2E-master/src/cours/dbconnect/UserMySQLDao.java:115:	CloseResource:	Ensure that resources like this ResultSet object are closed after use
/home/cobald/Documents/VV/MiniBlogJ2E-master/src/cours/dbconnect/UserMySQLDao.java:142:	LooseCoupling:	Avoid using implementation types like 'ArrayList'; use the interface instead
/home/cobald/Documents/VV/MiniBlogJ2E-master/src/cours/dbconnect/UserMySQLDao.java:142:	LooseCoupling:	Avoid using implementation types like 'ArrayList'; use the interface instead
/home/cobald/Documents/VV/MiniBlogJ2E-master/src/cours/dbconnect/UserMySQLDao.java:152:	CloseResource:	Ensure that resources like this Connection object are closed after use
/home/cobald/Documents/VV/MiniBlogJ2E-master/src/cours/dbconnect/UserMySQLDao.java:153:	CloseResource:	Ensure that resources like this Statement object are closed after use
/home/cobald/Documents/VV/MiniBlogJ2E-master/src/cours/dbconnect/UserMySQLDao.java:157:	CloseResource:	Ensure that resources like this ResultSet object are closed after use
/home/cobald/Documents/VV/MiniBlogJ2E-master/src/cours/dbconnect/UserMySQLDao.java:186:	LocalVariableNamingConventions:	The local variable name 'SQL' doesn't match '[a-z][a-zA-Z0-9]*'
/home/cobald/Documents/VV/MiniBlogJ2E-master/src/cours/dbconnect/UserMySQLDao.java:189:	CloseResource:	Ensure that resources like this Connection object are closed after use
/home/cobald/Documents/VV/MiniBlogJ2E-master/src/cours/dbconnect/UserMySQLDao.java:190:	CloseResource:	Ensure that resources like this PreparedStatement object are closed after use
/home/cobald/Documents/VV/MiniBlogJ2E-master/src/cours/dbconnect/UserMySQLDao.java:219:	LocalVariableNamingConventions:	The local variable name 'SQL' doesn't match '[a-z][a-zA-Z0-9]*'
/home/cobald/Documents/VV/MiniBlogJ2E-master/src/cours/dbconnect/UserMySQLDao.java:222:	CloseResource:	Ensure that resources like this Connection object are closed after use
/home/cobald/Documents/VV/MiniBlogJ2E-master/src/cours/dbconnect/UserMySQLDao.java:223:	CloseResource:	Ensure that resources like this PreparedStatement object are closed after use
/home/cobald/Documents/VV/MiniBlogJ2E-master/src/cours/dbconnect/UserMySQLDao.java:258:	LooseCoupling:	Avoid using implementation types like 'ArrayList'; use the interface instead
/home/cobald/Documents/VV/MiniBlogJ2E-master/src/cours/dbconnect/UserMySQLDao.java:277:	LocalVariableNamingConventions:	The local variable name 'SQL' doesn't match '[a-z][a-zA-Z0-9]*'
/home/cobald/Documents/VV/MiniBlogJ2E-master/src/cours/dbconnect/UserMySQLDao.java:282:	CloseResource:	Ensure that resources like this Connection object are closed after use
/home/cobald/Documents/VV/MiniBlogJ2E-master/src/cours/dbconnect/UserMySQLDao.java:283:	CloseResource:	Ensure that resources like this PreparedStatement object are closed after use
/home/cobald/Documents/VV/MiniBlogJ2E-master/src/cours/dbconnect/UserMySQLDao.java:314:	LocalVariableNamingConventions:	The local variable name 'SQL' doesn't match '[a-z][a-zA-Z0-9]*'
/home/cobald/Documents/VV/MiniBlogJ2E-master/src/cours/dbconnect/UserMySQLDao.java:319:	CloseResource:	Ensure that resources like this Connection object are closed after use
/home/cobald/Documents/VV/MiniBlogJ2E-master/src/cours/dbconnect/UserMySQLDao.java:320:	CloseResource:	Ensure that resources like this PreparedStatement object are closed after use
/home/cobald/Documents/VV/MiniBlogJ2E-master/src/cours/dbconnect/UserMySQLDao.java:347:	LooseCoupling:	Avoid using implementation types like 'ArrayList'; use the interface instead
/home/cobald/Documents/VV/MiniBlogJ2E-master/src/cours/dbconnect/UserMySQLDao.java:356:	CloseResource:	Ensure that resources like this Connection object are closed after use
/home/cobald/Documents/VV/MiniBlogJ2E-master/src/cours/dbconnect/UserMySQLDao.java:357:	CloseResource:	Ensure that resources like this Statement object are closed after use
/home/cobald/Documents/VV/MiniBlogJ2E-master/src/cours/dbconnect/UserMySQLDao.java:361:	CloseResource:	Ensure that resources like this ResultSet object are closed after use
/home/cobald/Documents/VV/MiniBlogJ2E-master/src/cours/dbconnect/UserMySQLDao.java:388:	LocalVariableNamingConventions:	The local variable name 'SQL' doesn't match '[a-z][a-zA-Z0-9]*'
/home/cobald/Documents/VV/MiniBlogJ2E-master/src/cours/dbconnect/UserMySQLDao.java:391:	CloseResource:	Ensure that resources like this Connection object are closed after use
/home/cobald/Documents/VV/MiniBlogJ2E-master/src/cours/dbconnect/UserMySQLDao.java:392:	CloseResource:	Ensure that resources like this PreparedStatement object are closed after use
/home/cobald/Documents/VV/MiniBlogJ2E-master/src/cours/dbconnect/UserMySQLDao.java:417:	LocalVariableNamingConventions:	The local variable name 'SQL' doesn't match '[a-z][a-zA-Z0-9]*'
/home/cobald/Documents/VV/MiniBlogJ2E-master/src/cours/dbconnect/UserMySQLDao.java:420:	CloseResource:	Ensure that resources like this Connection object are closed after use
/home/cobald/Documents/VV/MiniBlogJ2E-master/src/cours/dbconnect/UserMySQLDao.java:421:	CloseResource:	Ensure that resources like this PreparedStatement object are closed after use
/home/cobald/Documents/VV/MiniBlogJ2E-master/src/cours/dbconnect/UserMySQLDao.java:448:	LocalVariableNamingConventions:	The local variable name 'SQL' doesn't match '[a-z][a-zA-Z0-9]*'
/home/cobald/Documents/VV/MiniBlogJ2E-master/src/cours/dbconnect/UserMySQLDao.java:451:	CloseResource:	Ensure that resources like this Connection object are closed after use
/home/cobald/Documents/VV/MiniBlogJ2E-master/src/cours/dbconnect/UserMySQLDao.java:452:	CloseResource:	Ensure that resources like this PreparedStatement object are closed after use
/home/cobald/Documents/VV/MiniBlogJ2E-master/src/cours/dbconnect/UserMySQLDao.java:477:	LocalVariableNamingConventions:	The local variable name 'SQL' doesn't match '[a-z][a-zA-Z0-9]*'
/home/cobald/Documents/VV/MiniBlogJ2E-master/src/cours/dbconnect/UserMySQLDao.java:480:	CloseResource:	Ensure that resources like this Connection object are closed after use
/home/cobald/Documents/VV/MiniBlogJ2E-master/src/cours/dbconnect/UserMySQLDao.java:481:	CloseResource:	Ensure that resources like this PreparedStatement object are closed after use
/home/cobald/Documents/VV/MiniBlogJ2E-master/src/cours/dbconnect/UserMySQLDao.java:503:	LocalVariableNamingConventions:	The local variable name 'SQL' doesn't match '[a-z][a-zA-Z0-9]*'
/home/cobald/Documents/VV/MiniBlogJ2E-master/src/cours/dbconnect/UserMySQLDao.java:506:	CloseResource:	Ensure that resources like this Connection object are closed after use
/home/cobald/Documents/VV/MiniBlogJ2E-master/src/cours/dbconnect/UserMySQLDao.java:507:	CloseResource:	Ensure that resources like this PreparedStatement object are closed after use
/home/cobald/Documents/VV/MiniBlogJ2E-master/src/cours/dbconnect/UserMySQLDao.java:531:	LocalVariableNamingConventions:	The local variable name 'SQL' doesn't match '[a-z][a-zA-Z0-9]*'
/home/cobald/Documents/VV/MiniBlogJ2E-master/src/cours/dbconnect/UserMySQLDao.java:534:	CloseResource:	Ensure that resources like this Connection object are closed after use
/home/cobald/Documents/VV/MiniBlogJ2E-master/src/cours/dbconnect/UserMySQLDao.java:535:	CloseResource:	Ensure that resources like this PreparedStatement object are closed after use
/home/cobald/Documents/VV/MiniBlogJ2E-master/src/cours/dbconnect/UserMySQLDao.java:561:	LocalVariableNamingConventions:	The local variable name 'SQL' doesn't match '[a-z][a-zA-Z0-9]*'
/home/cobald/Documents/VV/MiniBlogJ2E-master/src/cours/dbconnect/UserMySQLDao.java:564:	CloseResource:	Ensure that resources like this Connection object are closed after use
/home/cobald/Documents/VV/MiniBlogJ2E-master/src/cours/dbconnect/UserMySQLDao.java:565:	CloseResource:	Ensure that resources like this PreparedStatement object are closed after use
/home/cobald/Documents/VV/MiniBlogJ2E-master/src/cours/dbconnect/UserMySQLDao.java:587:	LocalVariableNamingConventions:	The local variable name 'SQL' doesn't match '[a-z][a-zA-Z0-9]*'
/home/cobald/Documents/VV/MiniBlogJ2E-master/src/cours/dbconnect/UserMySQLDao.java:590:	CloseResource:	Ensure that resources like this Connection object are closed after use
/home/cobald/Documents/VV/MiniBlogJ2E-master/src/cours/dbconnect/UserMySQLDao.java:591:	CloseResource:	Ensure that resources like this PreparedStatement object are closed after use
/home/cobald/Documents/VV/MiniBlogJ2E-master/src/cours/dbconnect/UserMySQLDao.java:612:	MethodNamingConventions:	The static method name 'MD5' doesn't match '[a-z][a-zA-Z0-9]*'
/home/cobald/Documents/VV/MiniBlogJ2E-master/src/cours/dbconnect/UserMySQLDao.java:617:	ForLoopCanBeForeach:	This for loop can be replaced by a foreach loop
/home/cobald/Documents/VV/MiniBlogJ2E-master/src/cours/dbconnect/UserMySQLDao.java:621:	EmptyCatchBlock:	Avoid empty catch blocks
/home/cobald/Documents/VV/MiniBlogJ2E-master/src/cours/dbconnect/model/ModifAccount.java:5:	UseUtilityClass:	All methods are static.  Consider using a utility class instead. Alternatively, you could add a private constructor or make the class abstract to silence this warning.
/home/cobald/Documents/VV/MiniBlogJ2E-master/src/cours/dbconnect/model/PagePrincipale.java:5:	UnnecessaryImport:	Unused import 'javax.servlet.http.HttpSession'
/home/cobald/Documents/VV/MiniBlogJ2E-master/src/cours/dbconnect/model/PagePrincipale.java:9:	UseUtilityClass:	All methods are static.  Consider using a utility class instead. Alternatively, you could add a private constructor or make the class abstract to silence this warning.
/home/cobald/Documents/VV/MiniBlogJ2E-master/src/cours/dbconnect/model/PagePrincipale.java:25:	LooseCoupling:	Avoid using implementation types like 'ArrayList'; use the interface instead
/home/cobald/Documents/VV/MiniBlogJ2E-master/src/cours/dbconnect/model/PagePrincipale.java:35:	LooseCoupling:	Avoid using implementation types like 'ArrayList'; use the interface instead
/home/cobald/Documents/VV/MiniBlogJ2E-master/src/cours/dbconnect/model/PagePrincipale.java:35:	LooseCoupling:	Avoid using implementation types like 'ArrayList'; use the interface instead
/home/cobald/Documents/VV/MiniBlogJ2E-master/src/cours/dbconnect/model/PagePrincipale.java:42:	LooseCoupling:	Avoid using implementation types like 'ArrayList'; use the interface instead
/home/cobald/Documents/VV/MiniBlogJ2E-master/src/cours/dbconnect/model/Post.java:12:	LooseCoupling:	Avoid using implementation types like 'ArrayList'; use the interface instead
/home/cobald/Documents/VV/MiniBlogJ2E-master/src/cours/dbconnect/model/Post.java:16:	LooseCoupling:	Avoid using implementation types like 'ArrayList'; use the interface instead
/home/cobald/Documents/VV/MiniBlogJ2E-master/src/cours/dbconnect/model/Post.java:56:	LooseCoupling:	Avoid using implementation types like 'ArrayList'; use the interface instead
/home/cobald/Documents/VV/MiniBlogJ2E-master/src/cours/dbconnect/model/Post.java:59:	LooseCoupling:	Avoid using implementation types like 'ArrayList'; use the interface instead
/home/cobald/Documents/VV/MiniBlogJ2E-master/src/cours/dbconnect/model/Post.java:63:	LooseCoupling:	Avoid using implementation types like 'ArrayList'; use the interface instead
/home/cobald/Documents/VV/MiniBlogJ2E-master/src/cours/dbconnect/model/User.java:3:	UnnecessaryImport:	Unused import 'javax.servlet.http.HttpServletRequest'
/home/cobald/Documents/VV/MiniBlogJ2E-master/src/cours/dbconnect/model/User.java:6:	UnnecessaryImport:	Unused import 'com.sun.org.apache.xpath.internal.compiler.PsuedoNames'
/home/cobald/Documents/VV/MiniBlogJ2E-master/src/cours/dbconnect/model/User.java:41:	UncommentedEmptyConstructor:	Document empty constructor

```

L'erreur  : 
``` /home/cobald/Documents/VV/MiniBlogJ2E-master/src/Affichage.java:2:	NoPackage:	All classes, interfaces, enums and annotations must belong to a named package
Peut facilement être réglée en mettant la classe Affichage dans un package. ```

L'erreur :
``` /home/cobald/Documents/VV/MiniBlogJ2E-master/src/cours/dbconnect/BaseMySQLDao.java:18:	CloseResource:	Ensure that resources like this Connection object are closed after use ```
Il faudrait ajouter une fermeture de connection, dans un cas de
