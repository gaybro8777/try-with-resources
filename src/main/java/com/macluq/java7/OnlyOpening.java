package com.macluq.java7;

public class OnlyOpening {

    public static void main(String[] args) throws Exception {

        try (MyResource resource = new MyResource(true, false, false)) {
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