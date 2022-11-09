package javaClasses;

public class TestRepository {

    private static final TestRepository INSTANCE = null;

    private TestRepository() {
    }

    public static TestRepository getINSTANCE() {
        if (INSTANCE == null) {
            return new TestRepository();
        }
        return INSTANCE;
    }

    // singleton class
}
