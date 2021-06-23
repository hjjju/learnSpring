package org.zerock.sample;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Component
@ToString
@Getter
//@AllArgsConstructor
@RequiredArgsConstructor
public class SampleHotel {

//	private Chef chef;
//	
//	public SampleHotel(Chef chef) {  //생성자 선언후 chef주입
//		this.chef = chef;
//		
//	}
//	
//	
	
	
	@NonNull
	private Chef chef;

}
