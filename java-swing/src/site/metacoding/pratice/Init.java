package site.metacoding.pratice;

/**
 * 
 * @author ����� --- ������ �������-------------- initObject 1�� ���� initSetting 2�� ����
 *         initListener 3�� ���� (default)
 *
 */

public interface Init {
    void initObject();

    void initSetting();

    // ���γ��� ����
    // �������̽����� ��ü�� �ִ� �޼��带 ���� �� ����
    // �������� �����
    default void initListener() {
    };
}