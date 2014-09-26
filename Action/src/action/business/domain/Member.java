package action.business.domain;

/**
 * ����Ʈ ��ϵǴ� ��� ȸ���� ������ ���� ������ 
 * @author Sin-eon
 */
public class Member {
	
	/** ��ȿ�� ȸ������ ��Ÿ���� ��� */
	public static final int VALID_MEMBER = 1;
	
	/** memberID�� �������� �ʴ� ȸ������ ��Ÿ���� ��� */
	public static final int INVALID_ID = 0; 
	
	/** password�� ��ġ���� �ʴ� ȸ������ ��Ÿ���� ��� */
	public static final int INVALID_PASSWORD = -1;
	
	
	/** ȸ�� ID */
	private String id;
	
	/** ȸ�� ��й�ȣ */
	private String password;
	
	/** ȸ�� �̸� */
	private String name;
	
	/** ȸ�� �ּ� */
	private String address;
	
	/** ȸ�� ����ó */
	private String tel;
	
	/** ȸ�� ��� ȸ�� */
	private int warningCount;
	
	/**
	 * ȸ�� ���
	 * 0�� �Ϲ� ȸ��, 1�� �����ڷ� �����Ѵ�.
	 */
	private int memberClass;
	
	/** ȸ���� �α��� ��ȿ�� üũ */
	private int loginCheck;
	
	
	/** �⺻ ������ */
	public Member(){
		
	}	
	
	/** 
	 * ȸ�� ��Ͽ� ������ 
	 * 
	 */
	public Member(String id, String password, String name, String address,
			String tel, int warningCount, int memberClass) {		
		this.id = id;
		this.password = password;
		this.name = name;
		this.address = address;
		this.tel = tel;
		this.warningCount = warningCount;
		this.memberClass = memberClass;
	}
		
	/** ȸ�� �α��ο� ������ */
	public Member(String id, String password) {		
		this.id = id;
		this.password = password;
	}	
	
	/** ȸ�� ���������� ������ */
	public Member(String password, String name, String address, String tel) {		
		this.password = password;
		this.name = name;
		this.address = address;
		this.tel = tel;
	}

	/** getter & setter */
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public int getWarningCount() {
		return warningCount;
	}

	public void setWarningCount(int warningCount) {
		this.warningCount = warningCount;
	}

	public int getMemberClass() {
		return memberClass;
	}

	public void setMemberClass(int memberClass) {
		this.memberClass = memberClass;
	}

	public int getLoginCheck() {
		return loginCheck;
	}

	public void setLoginCheck(int loginCheck) {
		this.loginCheck = loginCheck;
	}

	@Override
	public String toString() {
		return "Member [id=" + id + ", password=" + password + ", name=" + name
				+ ", address=" + address + ", tel=" + tel + ", warningCount="
				+ warningCount + ", memberClass=" + memberClass + "]";
	}

}
