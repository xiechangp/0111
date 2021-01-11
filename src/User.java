class User {
    String passwrod;
    public User() {
        this("123456");
    }
    public User(String passwrod) {
        this.passwrod = passwrod;
    }
    public String getPasswrod() {
        return passwrod;
    }
}
