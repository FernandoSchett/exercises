package fabrica_computador;

public class emptyComputer implements computerState{
	
	@Override
	public computerState addHd() {
		System.out.println("HD adicionado no computador com sucesso.");
		return new construct2();
	}

	@Override
	public computerState addMotherboard() {
		System.out.println("N�o se deve adicionar uma placa M�e antes de adicionar um HD.");
		return this;
	}

	@Override
	public computerState addProcessor() {
		System.out.println("N�o se deve adicionar um processador antes de adicionar uma Placa M�e.");
		return this;
	}

	@Override
	public computerState addMemory() {
		System.out.println("N�o se deve adicionar uma mem�ria antes de adicionar um Processador.");
		return this;
	}

}
