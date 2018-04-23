package com.delta.java.learn.pattern.factory.constant;

/**
 * @author wwd
 *
 */
public enum ObjectTypeEnum {
	
	OBJECT_TYPE_GLASS(0,"GLASS"),
	
	OBJECT_TYPE_WHELL(1,"WHELL"),
	
    OBJECT_TYPE_UNKNOWN(-1,"UNKNOWN");
	
	private int type;
	
    private String description; 
    
	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	private ObjectTypeEnum(int type,String description) {
		this.type = type;
		this.description=description;
	}
	
	public static ObjectTypeEnum valueOf(int code) {
		for(ObjectTypeEnum objectTypeEnum : ObjectTypeEnum.values() ) {
			if(objectTypeEnum.getType() == code) {
				return objectTypeEnum;
			}
		}
		return OBJECT_TYPE_UNKNOWN;
	}

}
