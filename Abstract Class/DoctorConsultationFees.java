package com.exercises; 
//Develop Object Oriented Program to demonstrate abstract base classes
//abstract methods 
public class DoctorConsultationFees {
	public static void main(String[] args) {
		NeuroDoctor neuroObj = new NeuroDoctor();
		int neuroFees = neuroObj.getConsultationFees();
		System.out.println("Consultation Fees for Neuro:Rs." + neuroFees);
		NephroDoctor nephroObj = new NephroDoctor();
		int nephroFees = nephroObj.getConsultationFees();
		System.out.println("Consultation Fees for Nephro:Rs." + nephroFees);
		CardioDoctor cardioObj = new CardioDoctor();
		int CardioFees = cardioObj.getConsultationFees();
		System.out.println("Consultation Fees for Cardio:Rs." + CardioFees);
	}
}

abstract class DoctorFees {
	abstract int getConsultationFees();
}

class NeuroDoctor extends DoctorFees {
	@Override
	int getConsultationFees() {
		return 500;
	}
}

class NephroDoctor extends DoctorFees {
	@Override
	int getConsultationFees() {
		return 400;
	}
}

class CardioDoctor extends DoctorFees {
	@Override
	int getConsultationFees() {
		return 450;
	}
}