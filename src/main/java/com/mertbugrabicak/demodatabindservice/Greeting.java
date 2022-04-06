package com.mertbugrabicak.demodatabindservice;

public class Greeting {

    private long id;
    private String greetingText;
    private String greeter;

    public Greeting() {
    }

    public Greeting(long id, String greetingText, String greeter) {
        this.id = id;
        this.greetingText = greetingText;
        this.greeter = greeter;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getGreetingText() {
        return greetingText;
    }

    public void setGreetingText(String greetingText) {
        this.greetingText = greetingText;
    }

    public String getGreeter() {
        return greeter;
    }

    public void setGreeter(String greeter) {
        this.greeter = greeter;
    }
}
