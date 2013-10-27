package com.macluq.java7;

import com.macluq.java7.exceptions.ActionException;
import com.macluq.java7.exceptions.CloseResourceException;
import com.macluq.java7.exceptions.InitResourceException;

class MyResource implements AutoCloseable {

    private boolean throwOnInitResource;
    private boolean throwOnAction;
    private boolean throwOnCloseResource;

    MyResource(boolean throwOnInitResource, boolean throwOnAction, boolean throwOnCloseResource) throws InitResourceException {
        this.throwOnInitResource = throwOnInitResource;
        this.throwOnAction = throwOnAction;
        this.throwOnCloseResource = throwOnCloseResource;
        if (this.throwOnInitResource) throw new InitResourceException();
        System.out.println("Resource opening, no exception.");
    }

    public void anyGivenAction() throws ActionException {
        if (this.throwOnAction) throw new ActionException();
        System.out.println("Any given action happening, no exception.");
    }

    public void close() throws CloseResourceException {
        if (this.throwOnCloseResource) throw new CloseResourceException();
        System.out.println("Resource closing, no exception.");
    }
}
