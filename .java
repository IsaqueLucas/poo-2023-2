class Livro {
    String author;
    int age;
    String title;
    String publisher;
    
    void cumprimentar() {
        System.out.println("Olá, meu nome é " + title);
    }

    //metódos get
    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public String getPublisher() {
        return publisher;
    }
    
    public int getAge() {
        return age;
    }

    //métodos set

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    
    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        Livro ElonMusk = new Livro();
        ElonMusk.title = "Elon Musk Biografia";
        ElonMusk.age = 2023;
        ElonMusk.publisher = "Intrínseca";
        ElonMusk.author = "Walter Isaacson";


        Livro Turing = new Livro();
        Turing.title = "O Homem que Sabia Demais";
        Turing.age = 2013;
        Turing.publisher = "Novo Conceito";
        Turing.author = "David Leavitt";


        Livro Jordan = new Livro();
        Jordan.title = "O Lobo de Wall Street";
        Jordan.age = 2013;
        Jordan.publisher = "Cantam";
        Jordan.author = "Jordan Belfort";

        Livro Messi = new Livro();
        Messi.title = "Messi Biografia sla";
        Messi.age = 1987;
        Messi.publisher = "Barcelona";
        Messi.author = "Lionel Andres Messi";


        Messi.getAge();
        Messi.getAuthor();
        Messi.getTitle();
        Messi.getPublisher();

        Jordan.getAge();
        Jordan.getTitle();
        Jordan.getPublisher();
        Jordan.getAuthor();

        Turing.getAge();
        Turing.getTitle();
        Turing.getPublisher();
        Turing.getAuthor();

        ElonMusk.getAge();
        ElonMusk.getTitle();
        ElonMusk.getPublisher();
        ElonMusk.getAuthor();


    }


}