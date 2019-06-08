public class Numero implements Operador {

    private int numero;
    private String numero10;
    private String numero11;

    public Numero(int numero) {
        this.numero = numero;    }
    
    public Numero(String numero10) {
        this.numero10 = numero10;    }
    
	@Override
	public long inter() {
		return this.numero;	}
	
	public String interpretar10() {
		return this.numero10;	}
	@Override
	public String interpretar11() {
		return this.numero11;	}
}
