package com.macluq.java7;

import com.macluq.java7.exceptions.FinallyException;

public class ActionAndFinally {

    public static void main(String[] args) throws Exception {

        try (MyResource resource = new MyResource(false, true, true)) {
            resource.anyGivenAction();
        }
        catch (Exception e) {
            System.out.println("Catching " + e.getClass());
        }
        finally {
            System.out.println("At the finally");
            throw new FinallyException();
        }
    }
}