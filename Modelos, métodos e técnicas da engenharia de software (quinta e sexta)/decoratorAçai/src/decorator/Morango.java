package decorator;

public class Morango extends BaseDecorator{
	
	public Morango(Adicional add) {
		super(add);
	}
	
	@Override
	public String getDescric�o() {
		return super.getDescric�o() + ", morango";
	}
	
	@Override
	public float custo() {
		return super.custo() + 2;
	}
}
