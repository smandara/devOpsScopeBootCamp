package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClient;

@RestController
public class LoanCheckController {
	
	@GetMapping("/loanCheck/{cs}/{salary}/{loanAmount}")
	public ResponseEntity<LoanResponse> loanCheck(@PathVariable("cs")int cs,@PathVariable("salary")int salary,@PathVariable("loanAmount")int loanAmount){
		
		int approvedAmount = 0;
		boolean status = false;
		
		if (cs>750 && salary > 50000) {
			if (loanAmount > 100000 ) {
				approvedAmount = 100000;
				status = true;
			}else {
				approvedAmount = loanAmount;
				status = true;
			}	
			
		}
		
		LoanResponse loanResponse = new LoanResponse(approvedAmount, status);
		return ResponseEntity.ok(loanResponse);
		
	}
	
	@GetMapping("/posts/{id}")
	public ResponseEntity<PostResponse> getResponseFromJsonHolder(@PathVariable("id") int id){
		String uri="https://jsonplaceholder.typicode.com/posts/"+id;
		PostResponse pr = RestClient.create().get().uri(uri).retrieve().body(PostResponse.class);
		return ResponseEntity.ok(pr);
		
	}

}
