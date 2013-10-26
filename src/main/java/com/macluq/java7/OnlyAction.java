package trywithresources;

public class OnlyAction {

    public static void main(String[] args) throws Exception {

        try (MyResource resource = new MyResource(false, true, false)) {
            resource.anyGivenAction();
        }
        catch (Exception e) {
            System.out.println("Catching " + e.getClass());
        }
        finally {
            System.out.println("At the finally");
        }
    }
}