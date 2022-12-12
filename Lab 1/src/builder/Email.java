package builder;

import javax.swing.*;

public class Email {
    private String from;
    private String to;
    private String subject;
    private String message;
    private Object attach;

    private Email(String from, String to, String subject, String message, Object attach){
        this.from=from;
        this.to=to;
        this.subject=subject;
        this.message=message;
        this.attach=attach;
    }

    @Override
    public String toString() {
        return "Email{" +
                "from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", subject='" + subject + '\'' +
                ", message='" + message + '\'' +
                ", attach=" + attach +
                '}';
    }

    public static class EmailBuiler{
        private String from;
        private String to;
        private String subject;
        private String message;
        private Object attach;

        public EmailBuiler(String to){
            this.to=to;
        }
        public EmailBuiler withFrom(String from){
            this.from=from;
            return this;
        }
        public EmailBuiler withSubject(String subject){
            this.subject=subject;
            return  this;
        }
        public EmailBuiler withMessage(String message){
            this.message=message;
            return this;
        }
        public EmailBuiler withAttach(Object attach){
            this.attach=attach;
            return this;
        }

        public Email build(){
            return new Email(this.from, this.to, this.subject, this.message, this.attach);

        }
    }

}
