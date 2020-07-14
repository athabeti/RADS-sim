package com.vad.RemoteDirectorySimulator;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.vad.RemoteDirectorySimulator.Model.FetchResponse;
import com.vad.RemoteDirectorySimulator.Model.FetchResponseEntity;
import com.vad.RemoteDirectorySimulator.Repo.FetchRepository;



@SpringBootApplication
public class RemoteDirectorySimulatorApplication {

    public static void main(String[] args) {
        SpringApplication.run(RemoteDirectorySimulatorApplication.class, args);
    }
    
    // init bean to insert 3 books into h2 database.
    @Bean
    CommandLineRunner initDatabase(FetchRepository repository) {
        return args -> {
           // repository.save(new FetchResponse(1001,"4100124578904312","PAN","2020-07-01 18:20:00.000000","Ravi", "kumar","ravikumar@gmail.com","ravi","kumar", 
            //      "900 Metro center blvd","","fosterCity","94404","US","254711001987");
            
         repository.save(new FetchResponseEntity("1234567809871234", "PAN","testdata@gmail.com","email","2020-07-01 18:20:00.000000","John", "beosz","testdata@gmail.com",
                 "johny","besosz", "ul. Lesnaya d. 5, kv. 176", "Address line2", "MOSKVA","125075","","RU","",""));
         repository.save(new FetchResponseEntity("4033675890124352", "PAN","+1-8001876123","phone","2020-07-01 18:20:00.000000","Petrov ", "Ivan Sergeevich ","petroIvan@gmail.com",
                 "ivan","", "900 Metro center blvd", "", "VORONEJSKAYA","247112","","RU","",""));    
         repository.save(new FetchResponseEntity("5500000000000004", "PAN","GB98MIDL07009312345678","iban","2020-07-02 18:20:00.000000","Zao", "Zarnica","zao_zarnica@gmail.com",
                 "Zao","Zarnica", "a/ya 15", "", "Gorod","103375","MOSCOW","RU","",""));     
         repository.save(new FetchResponseEntity("4111111111111111", "PAN","athabeti0132213123","custom","2020-07-09 18:20:00.000000","Abhilash", "Thabeti","thabeti_abhi@gmail.com",
                 "abhi","thabeti", "900 Metro center blvd", "123", "fosterCity","94404","flordia","US","macys","ecomm"));
         repository.save(new FetchResponseEntity("340000000000009", "PAN","*139*1*1234567890#","ussd","2020-07-09 18:20:00.000000","Sergieyu", "Kurochkiny","Kurochkiny@gmail.com",
                 "Sergieyu","Kurochkiny", "a/ya 888 ", " ", "Moskva","103378","Kirov","RU","",""));
         repository.save(new FetchResponseEntity("6011000000000004", "PAN","20200709-00012","nationalId","2020-07-09 18:20:00.000000","Sergieyu", "Kurochkiny","Kurochkiny@gmail.com",
                 "","", " ", " ", "","","","RU","",""));
         repository.save(new FetchResponseEntity("6011000000009994", "PAN","BA001234000012","bid","2020-07-09 18:20:00.000000","Lesnaya", "Orehovaya","",
                 "","", " ", " ", "","","","RU","",""));
         
         repository.save(new FetchResponseEntity("6011000000009995", "PAN","summer@funundersun","custom","2020-07-09 18:20:00.000000","Abhilash", "Thabeti","cric2020@gmail.com",
                 "","", "900 Metro center blvd", "", "","94404","","US","Friendster","social"));
               };
    }

}
