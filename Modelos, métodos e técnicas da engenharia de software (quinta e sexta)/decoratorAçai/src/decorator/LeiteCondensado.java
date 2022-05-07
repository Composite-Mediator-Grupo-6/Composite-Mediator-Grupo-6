package decorator;

public class LeiteCondensado extends BaseDecorator{
	
	public LeiteCondensado(Adicional add) {
		super(add);
	}
	
	@Override
	public String getDescric�o() {
		return super.getDescric�o() + ", leite condensado";
	}
	
	@Override
	public float custo() {
		return super.custo() + 2.5f;
	}
}
