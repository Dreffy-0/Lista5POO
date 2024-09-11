class Aluno {
    private String matricula;
    private double nota;

    public Aluno(String matricula, double nota) {
        this.matricula = matricula;
        this.nota = nota;
    }

    public String getConceito() {
        if (nota >= 9) return "A";
        else if (nota >= 7.5) return "B";
        else if (nota >= 6) return "C";
        else if (nota >= 4) return "D";
        else return "F";
    }

    public String getMatricula() {
        return matricula;
    }

    public double getNota() {
        return nota;
    }
}