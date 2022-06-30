package V_alteravel;

public class AlignmentMember {
	// Atributos
		private int referenceMember;
		
		// Agregação com AllignedSegment
		private AligneSegment segmentaligned[];

		// Métodos de Acesso
		public int getReferenceMember() {
			return referenceMember;
		}

		public void setReferenceMember(int referenceMember) {
			this.referenceMember = referenceMember;
		}

		public AligneSegment[] getSegmentaligned() {
			return segmentaligned;
		}

		public void setSegmentaligned(AligneSegment[] segmentaligned) {
			this.segmentaligned = segmentaligned;
		}

}
