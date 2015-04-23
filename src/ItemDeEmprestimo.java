/**
 * Created by joaovitor on 4/23/15.
 */
public class ItemDeEmprestimo {
    private Emprestimo emprestimo;

    public ItemDeEmprestimo(Emprestimo emprestimo){
        this.associaEmprestimo(emprestimo);
    }

    public void associaEmprestimo(Emprestimo emprestimo){
        this.emprestimo = emprestimo;
    }

    public Emprestimo getEmprestimo(){
        return emprestimo;
    }

}
