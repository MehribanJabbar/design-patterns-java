package creationalDP.factory;

public class Software {

    public static void main(String[] args) {
        var developerFactory=createProgrammingLanguage(ProgrammingLanguage.JAVA);
        var developer=developerFactory.createDeveloper();
        developer.writeCode();
    }


    public static DeveloperFactory createProgrammingLanguage(ProgrammingLanguage programmingLanguage){
        return switch (programmingLanguage){
            case JAVA -> new JavaDeveloperFactory();
            case KOTLIN -> new KotlinDeveloperFactory();
        };
    }
}
