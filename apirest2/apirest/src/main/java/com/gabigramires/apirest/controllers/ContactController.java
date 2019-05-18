package com.gabigramires.apirest.controllers;

	import java.net.URI;
	import java.util.List;

	import javax.validation.Valid;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.http.ResponseEntity;
	import org.springframework.web.bind.annotation.DeleteMapping;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.PathVariable;
	import org.springframework.web.bind.annotation.PostMapping;
	import org.springframework.web.bind.annotation.PutMapping;
	import org.springframework.web.bind.annotation.RequestBody;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RestController;
	import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

	import com.gabigramires.apirest.models.Contact;
	import com.gabigramires.apirest.services.ContactService;


		@RestController
		@RequestMapping("/contacts")
		public class ContactController {
			
			@Autowired
			private ContactService contactService;
			
			@PostMapping
			public ResponseEntity<Contact> create(@Valid @RequestBody Contact contact){
				Contact obj = contactService.save(contact);
				URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();
				return ResponseEntity.created(uri).body(obj);
			}
			
		}

	



