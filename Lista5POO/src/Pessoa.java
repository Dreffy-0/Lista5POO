import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

class Pessoa {
    private String nome;
    private LocalDate dataNascimento;
    private double altura;

    public Pessoa(String nome, String dataNascimento, double altura) {
        this.nome = nome;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.dataNascimento = LocalDate.parse(dataNascimento, formatter);
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public double getAltura() {
        return altura;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDataNascimento(String dataNascimento) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.dataNascimento = LocalDate.parse(dataNascimento, formatter);
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int calcularIdade() {
        return Period.between(dataNascimento, LocalDate.now()).getYears();
    }

    public void imprimirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Data de Nascimento: " + dataNascimento.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        System.out.println("Altura: " + altura);
        System.out.println("Idade: " + calcularIdade() + " anos");
    }
}
