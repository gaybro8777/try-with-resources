package com.macluq.java7;

import com.macluq.java7.exceptions.CatchException;
import com.macluq.java7.exceptions.FinallyException;

public class AllButOpening {

    public static void main(String[] args) throws Exception {

        try (MyResource resource = new MyResource(false, true, true)) {
            resource.anyGivenAction();
        }
        catch (Exception e) {
            System.out.println("Catching " + e.getClass());
            throw new CatchException();
        }
        finally {
            System.out.println("At the finally");
            throw new FinallyException();
        }
    }
}