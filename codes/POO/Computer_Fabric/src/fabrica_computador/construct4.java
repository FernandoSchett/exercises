package fabrica_computador;

public class construct4 implements computerState {

	@Override
	public computerState addHd() {
		System.out.println("O computador j� tem um HD.");
		return null;
	}

	@Override
	public computerState addMotherboard() {
		System.out.println("O computador j� tem uma Placa M�e.");
		return null;
	}

	@Override
	public computerState addProcessor() {
		System.out.println("O computador j� tem um processador.");
		return new construct4();
	}


	@Override
	public computerState addMemory() {
		System.out.println("Processador adicionado com sucesso.");
		return new completeComputer();
	}

}
