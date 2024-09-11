class Professor {
    private String nome;
    private String cpf;
    private String titulacao;
    private double salario;

    public Professor(String nome, String cpf, String titulacao, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.titulacao = titulacao;
        this.salario = salario;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public double calcularContribuicao() {
        switch (titulacao.toLowerCase()) {
            case "especialista":
                return salario * 0.012;
            case "mestre":
                return salario * 0.014;
            case "doutor":
                return salario * 0.016;
            default:
                return 0;
        }
    }
}