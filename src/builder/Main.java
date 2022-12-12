package builder;

public class Main {
    public static void main(String[] args) {
        Email.EmailBuiler emailBuilder = new Email.EmailBuiler("dvechiu@gmail.com") //construieste builderul, ii dam parametri doriti
                .withFrom("vechiu@gmail.com")//returneaza tot obiectul
                .withSubject("Note")
                .withMessage("Sunt note");


        Email email1= emailBuilder.build();

        System.out.println(email1);


         Email.EmailBuiler emailBuiler1 =new Email.EmailBuiler("ion@gmail.com");
         Email.EmailBuiler emailBuiler2= emailBuiler1.withFrom("ana@gmail.com");
         Email.EmailBuiler emailBuiler3 =emailBuiler2.withSubject("Atestare").withMessage("okok");
         Email email2=emailBuiler3.build();
        System.out.println(email2);


        Email email3 = new Email.EmailBuiler("ion@gmail.com").build();
        System.out.println(email3);

        Email email4 = new Email.EmailBuiler("ion@gmail.com")
                .withFrom("ana@gmail.com")
                .withSubject("Atestare")
                .withAttach("bla bla")
                .build();
        System.out.println(email4);

    }
}
