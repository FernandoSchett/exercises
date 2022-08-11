package fabrica_computador;

public class construct3 implements computerState {

	@Override
	public computerState addHd() {
		System.out.println("O computador j� tem um HD.");
		return this;
	}

	@Override
	public computerState addMotherboard() {
		System.out.println("O computador j� tem uma Placa M�e.");
		return this;
	}

	@Override
	public computerState addProcessor() {
		System.out.println("Processador adicionado com sucesso.");
		return new construct4();
	}

	@Override
	public computerState addMemory() {
		System.out.println("N�o se deve adicionar uma mem�ria antes de adicionar um processador.");
		return this;
	}

}
