package projeto1;

import javax.swing.JFileChooser;

public class Aluno {
    
    private String nome;
    private int matricula;
    private int id;
    private String turma;
    private byte[] foto;

    public Aluno(int id, int matricula, String nome, String turma, byte[] foto) {
        this.id = id;
        this.nome = nome;
        this.matricula = matricula;
        this.turma = turma;
        this.foto = foto;
    }

    public Aluno() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public byte[] getFoto() {
        return foto;
    }

    public void setFoto(byte[] foto) {
        this.foto = foto;
    }

    
    
    public void exibirInformacoes(){
        System.out.println("Nome: "+this.getNome());
        System.out.println("Matricula: "+this.getMatricula());
        System.out.println("Turma: "+this.getTurma());
        System.out.println("Foto: "+this.getFoto());
    }
}
