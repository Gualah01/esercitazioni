import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Poly
 * Classe concreta che rappresenta un polinomio in una sola variabile a coefficienti interi
 */
public class Poly {
    
    /* Ciascun termine rappresenta coeff * x^degree.
     * Le istanze di questo record rappresentano termini di polinomi
     * Gli oggetti di questo tipo sono immutabili.
     */
    public record Term(int coeff, int degree){
        //Costruttori
        public Term{
            if(degree < 0) throw new NegativeExponentException("Il grado dev'essere positivo");
        }

        @Override
        public String toString(){
            return coeff + "x^" + degree;
        }
    }

    //Campi

    /* La lista contenente i termini del polinomio, ordinati per grado.
     * esempio: Term(1,2), Term(3,4), Term(5,6) -> x^2 + 3x^4 + 5x^6
     */
    private final List<Term> terms;

    //Constructors

    /**
     * Costruisce il polinomio zero
     */
    public Poly(){
        terms = new ArrayList<>();
    }

    /**
     * Costruisce un monomio(cx^n)
     * @param c coefficiente del monomio
     * @param n grado del monomio
     */
    public Poly(int c, int n) {
        this();
        if (c != 0) terms.add(new Term(c, n));
    }

    //Methods

    /**
     * @param q polinomio da sommare
     * @return la somma tra i polinomi this e q
     */
    public Poly add(Poly q){
        Poly res = new Poly();
        int maxDegree = Math.max(this.degree(), q.degree());
        for (int i = 0; i < maxDegree; i++) {
            res = new Poly((this.coeff(i) + q.coeff(i)), i);
        }
        return res;
    }

    /**
     * @return il grado del polinomio
     */
    public int degree(){
        if(this.terms.size() == 0){
            return 0;
        }else{
            return this.terms.get(terms.size()-1).degree;
        }
    }

    /**
     * @param d grado del termine
     * @return coefficiente del termine di grado d
     */
    public int coeff(int d){
        for (Term term : terms) {
            if (term.degree == d) {
                return term.coeff;
            }
        }
        return 0;
    }
}