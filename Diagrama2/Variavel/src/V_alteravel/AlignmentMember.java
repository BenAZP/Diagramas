package V_alteravel;

public class AlignmentMember {
	// Atributos
		private int referenceMember;
		
		// Agrega��o com AllignedSegment
		private AligneSegment segmentaligned[];

		// M�todos de Acesso
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
