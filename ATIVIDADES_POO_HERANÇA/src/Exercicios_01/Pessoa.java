package Exercicio1;

public class Pessoa {
private String nome;
private int idade;
private String sexo;

```
public Pessoa(String nome, int idade, String sexo) {
    this.nome = nome;
    this.idade = idade;
    this.sexo = sexo;
}

public void fazerAniv() {
    this.idade++;
}

public String getNome() {
    return nome;
}

public int getIdade() {
    return idade;
}

public String getSexo() {
    return sexo;
}
```

}

class Aluno extends Pessoa {
private int matr;
private String curso;

```
public Aluno(String nome, int idade, String sexo, int matr, String curso) {
    super(nome, idade, sexo);
    this.matr = matr;
    this.curso = curso;
}

public void cancelarMatr() {
    this.matr = 0;
}

public int getMatr() {
    return matr;
}

public String getCurso() {
    return curso;
}
```

}

class Professor extends Pessoa {
private String especialidade;
private double salario;

```
public Professor(String nome, int idade, String sexo, String especialidade, double salario) {
    super(nome, idade, sexo);
    this.especialidade = especialidade;
    this.salario = salario;
}

public void receberAum(double valor) {
    this.salario += valor;
}

public String getEspecialidade() {
    return especialidade;
}

public double getSalario() {
    return salario;
}
```

}

class Funcionario extends Pessoa {
private String setor;
private boolean trabalhando;

```
public Funcionario(String nome, int idade, String sexo, String setor, boolean trabalhando) {
    super(nome, idade, sexo);
    this.setor = setor;
    this.trabalhando = trabalhando;
}

public void mudarTrabalho(String novoSetor) {
    this.setor = novoSetor;
}

public String getSetor() {
    return setor;
}

public boolean isTrabalhando() {
    return trabalhando;
}
```

}

class Main {
public static void main(String[] args) {
Aluno a = new Aluno("Lucas", 20, "M", 123, "TI");
Professor p = new Professor("Marcos", 45, "M", "Matemática", 3500);
Funcionario f = new Funcionario("Ana", 30, "F", "Administração", true);

```
    a.fazerAniv();
    p.receberAum(500);
    f.mudarTrabalho("Financeiro");

    System.out.println(a.getNome() + " - Idade: " + a.getIdade() + " - Curso: " + a.getCurso());
    System.out.println(p.getNome() + " - Salário: " + p.getSalario());
    System.out.println(f.getNome() + " - Setor: " + f.getSetor());
}
```

}
