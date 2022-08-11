package fabrica_computador;

public class construct2 implements computerState {

	@Override
	public computerState addHd() {
		System.out.println("O computador j� tem um HD.");
		return this;
	}

	@Override
	public computerState addMotherboard() {
		System.out.println("Placa M�e adicionada com sucesso.");
		return new construct3();
	}

	@Override
	public computerState addProcessor() {
		System.out.println("N�o se deve adicionar um processador antes de adicionar uma Placa M�e.");
		return this;
	}

	@Override
	public computerState addMemory() {
		System.out.println("N�o se deve adicionar uma mem�ria antes de adicionar um processador");
		return this;
	}

}
