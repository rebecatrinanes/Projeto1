package br.pro.hashi.ensino.desagil.tequilada;

public abstract class Element {
	protected int row;
	protected int col;

	protected Element(int row, int col) {
		this.row = row;
		this.col = col;
	}

	public int getRow() {
		return row;
	}
	public int getCol() {
		return col;
	}
}
