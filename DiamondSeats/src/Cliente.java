// Class que define los clientes que realizan la compra de boletos
public class Cliente {
    private String name;
    private String email;
    private String phone;
    // Constructor
    public Cliente(String name, String email, String phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }
}
