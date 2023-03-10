package com.vignesh.generics;

public class Bin<D, W> {
	
	private D dryTrash;
	private W wetTrash;
	public Bin() {
	}
	public Bin(D dryTrash, W wetTrash) {
		this.dryTrash = dryTrash;
		this.wetTrash = wetTrash;
	}
	public D getDryTrash() {
		return dryTrash;
	}
	public void setDryTrash(D dryTrash) {
		this.dryTrash = dryTrash;
	}
	public W getWetTrash() {
		return wetTrash;
	}
	public void setWetTrash(W wetTrash) {
		this.wetTrash = wetTrash;
	}
	@Override
	public String toString() {
		return super.toString();
	}

}
