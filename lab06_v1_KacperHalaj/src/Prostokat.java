
class Prostokat  extends Figura{
	double wys=0, szer=0;
	
	Prostokat(double wys,double szer){
		this.wys = wys;
		this.szer = szer;
			
	}
    double getPowierzchnia() {
        return (szer * wys);
    }


	public Prostokat(String kolor, double wys, double szer) {
		super(kolor);
		this.wys = wys;
		this.szer = szer;
	}

	public void przesun(float x, float y){
		this.szer+=x;
		this.wys+=y;
	}

	@Override
	public String opis(){
		System.out.println("Prostokat o wymiarach: "+szer+" x "+wys+" w kolorze "+getKolor());
		return null;
	}



}