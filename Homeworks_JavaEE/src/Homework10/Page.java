package Homework10;

public class Page {
	private String title;
	private String text;
	
	Page(){
		title = "";
		text = "";
	}
	
	void addText(String text)
	{
		if(text!=null){
			this.text += ("\n" + text);
		}
	}

	void deleteText(){
		text = "";	 					// или text = null;
		//title = "";
	}
	
	boolean isEmpty(){
		if(title.isEmpty() && text.isEmpty()){
			return true;
		}
		return false;
	}
	boolean searchWord(String word){
		String temp = new String();
		for(int index=0; index<text.length(); index++){
			while(index<text.length() && text.charAt(index)!=' '){
				temp+=text.charAt(index);
				index++;
			}
			if(word.toLowerCase().equals(temp.toLowerCase())){
				return true;
			}
			temp="";
		}
		return false;
	}
	
	boolean containsDigit(){
		for(int index=0; index<text.length(); index++){
			if(text.charAt(index)>='0' && text.charAt(index)<='9'){
				return true;
			}
		}
		return false;
	}
	
	@Override
	public String toString() {
		StringBuilder str = new StringBuilder();
		if(title!=null && !title.isEmpty()){
			str.append(title);
		}
		if(text!=null && !text.isEmpty()){
			str.append(text);
		}
		return str.toString();
	}
	
	void setTitle(String title){
		if(title!=null && !title.isEmpty()){
			this.title = title;
		}
	}
}
