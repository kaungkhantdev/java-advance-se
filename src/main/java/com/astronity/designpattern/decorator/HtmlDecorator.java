package com.astronity.designpattern.decorator;

public class HtmlDecorator implements Logger {
    Logger logger;
    public HtmlDecorator(Logger logger) {
        this.logger = logger;
    }

    @Override
    public String log(String message) {
        return "<html>"+ logger.log(message) +"</html>";
    }
}
