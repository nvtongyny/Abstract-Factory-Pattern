public abstract class APiece {
    protected String inKind;
    public APiece(String inKind){
        this.inKind = inKind;
    }
    //����ʱ���ӵ�λ��
    public abstract void Play(int x,int y);
}
