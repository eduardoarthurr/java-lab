package FiapLab;

public class PersonagemMagico {

    public String nome;

    public String poder;

    public int nivelEnergia;

    public HabilidadeEspecial habilidadeEspecial;

    public void ataque(String atacar){
        if (nivelEnergia >= 10){
            System.out.println(nome + " " + "Realizou um ataque: " + atacar + "!");
            nivelEnergia -= 10;
        }
        else{
            System.out.println(nome + " " + "Está com o nivel de energia muito maixo para atacar.");
        }
    }

    public int aumentarEnergia(int energia){
        nivelEnergia = nivelEnergia + energia;
        return nivelEnergia;
    }

    public void ativarHabilidadeEspecial(){
        if(!habilidadeEspecial.habilitada ){
            System.out.println("A habilidade especial nao está ativada.");
        }
        else if(nivelEnergia >= habilidadeEspecial.custoEnergia){
            System.out.println(nome + " " +"USOU SUA HABILIDADE ESPECIAL" + " " + habilidadeEspecial.nome + "!!");
            nivelEnergia -= habilidadeEspecial.custoEnergia;
        }
        else{
            System.out.println(nome + " " + "não tem energia suficiente para usar sua habilidade especial.");
        }
    }


}
