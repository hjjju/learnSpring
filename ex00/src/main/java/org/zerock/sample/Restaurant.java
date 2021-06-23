package org.zerock.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.Setter;

@Component
@Data
public class Restaurant {
	
	
	//@Setter 자동으로 setChef()를 컴파일시 생성
	//onMethod 속성: 생성되는 setChef()에 @Autowired 어노테이션을 추가하도록함
	@Setter(onMethod_ = @Autowired)
	private Chef chef;
	

}
