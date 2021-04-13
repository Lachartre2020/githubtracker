package fr.wildcodeschool.githubtracker.model;

public class Githuber {
    private String name;
    private String email;
    private String login;
    private String id;


    public Githuber(String name, String email, String login, String id) {
        setName(name);
        setEmail(email);
        setLogin(login);
        setId(id);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

