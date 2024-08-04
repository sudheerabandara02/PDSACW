package pdsacw;
import java.util.Scanner;
import java.io.*;
import java.time.LocalTime;


public class okayAllLevels
{
    Scanner getdata = new Scanner(System.in);
    
    String[][] levelA ={{"The flowers bloom in the garden.","The rain falls gently on the roof.","He likes to garden in his free time.","They often have game nights with their friends.","The statue is a symbol of freedom and democracy.","A pack of wolves hunts in groups.","They use teamwork to catch their prey and stay strong.","They run around and try to score goals.","Anne enjoys painting on rainy days.","She likes to create colorful pictures and relax."},{ "He likes to listen to music while he works.","The dog loves to chase squirrels in the yard.","The flowers in the garden are a striking mix of red and blue.","She enjoys knitting scarves in the winter.","She makes them for her friends and family as gifts.","They can accelerate from 0 to 60 miles per hour in just a few seconds.","It has three volcanic cones: Kibo, Mawenzi, and Shira.","They are also known for their bright, iridescent feathers.","They also lay the largest eggs of any bird species.","Its thick atmosphere traps heat in a runaway greenhouse effect."},{"The Moon's surface is covered with craters, mountains, and plains.","Joeys stay in the pouch for several months before venturing out.","Honeybees play a vital role in pollinating flowers and crops, which is essential for food production.","Water covers about 71% of the Earth's surface, with most of this water found in the oceans.","Oceans are home to a vast array of marine life and play a critical role in regulating the planet's climate.","They also provide resources and livelihoods for millions of people.","A group of dolphins is called a pod.","Penguins cannot fly, but they are excellent swimmers.","Dolphins are very social animals and often swim together in groups for protection and companionship.","Reaching its summit requires extraordinary endurance and acclimatization."}};
    String[][] levelB ={{"The cat sat on the mat.","She likes to eat apples.","The dog runs fast in the park.","The sun is hot today.","He reads a book every night.","The flowers are red and blue.","They went to the store to buy milk.","The bird sings in the tree.","The wind rustles through the leaves.","The squirrel scurries across the lawn"},{"They go hiking in the mountains when they can.","They enjoy the walk and the view from the top.","He plants flowers and vegetables and enjoys watching them grow.","They play board games and have snacks while they hang out.","They use buckets and shovels to make tall towers and moats.","He finds it relaxing and enjoys spending time by the lake."," It’s a peaceful way for her to enjoy nature.","The kids have fun playing soccer in the backyard.","He runs around excitedly, barking and jumping.","It helps him focus and makes the time go by faster."},{"The Amazon Rainforest is the largest rainforest in the world, covering over 5.5 million square kilometers.","The Pacific Ocean is the deepest and largest ocean on Earth, with an average depth of about 12,080 feet.","Mount Everest is the highest mountain in the world, standing at 29,029 feet above sea level.","The Great Wall of China is over 13,000 miles long, making it the longest wall in the world.","The Sahara Desert is the largest hot desert in the world, covering an area of 9.2 million square kilometers.","The Nile River is the longest river in the world, stretching approximately 4,135 miles through northeastern Africa.","The human brain contains about 86 billion nerve cells, also known as neurons.","Honey never spoils; archaeologists have found pots of honey in ancient Egyptian tombs that are over 3,000 years old and still edible.","The blue whale is the largest animal ever known to have existed, with some individuals reaching lengths of up to 100 feet.","The Eiffel Tower, an iconic Parisian landmark, was completed in 1889 and stands at a height of 324 meters, making it the tallest structure in Paris."}};
    String[][] levelC ={{"A baby kangaroo is called a joey. When born, a joey is as small as a jellybean.","Honeybees can recognize human faces. They use this skill to remember who comes near their hive.","The Great Wall of China is very long. It is over 13,000 miles and can be seen from space.","Water covers about 71% of the Earth. Most of this water is in the oceans.","A group of dolphins is called a pod. Dolphins like to swim together in groups.","Penguins cannot fly, but they can swim very well. They can swim up to 15 miles per hour.","A flock of birds flies together in the sky. They move in patterns to stay safe from predators.","A herd of elephants walks together. They help and protect each other as they travel.","A pride of lions lives together. They work as a team to hunt and care for their cubs.","A school of fish swims together in the water. This helps them stay safe from bigger fish."},{"Bananas are berries, but strawberries are not. Botanically, bananas fit the definition of a berry, while strawberries do not.","They go swimming at the lake every weekend. The cool water feels refreshing, and they spend hours splashing around and playing games in the sun.","Timmy is a playful puppy who loves to run around and chase after his toys. He has a lot of energy and always makes everyone laugh with his silly antics.","They go hiking in the mountains whenever they have time. They like exploring the trails and enjoying the beautiful views from the top.","The children love playing in the snow during winter. They build snowmen, make snow angels, and have snowball fights until they are tired.","Max is an energetic dog who loves to play fetch in the park. He runs fast and always brings the ball back with a wagging tail.","Elephants have excellent memories. They can remember the locations of water sources even after many years.","The Amazon Rainforest is vast. It covers over 2.1 million square miles and produces about 20% of the world's oxygen.","Approximately 30% of the Earth's land surface is covered by forests. These forests are vital for absorbing carbon dioxide.","Eagles cannot swim, but they are excellent fliers. They can soar at altitudes of up to 10,000 feet and reach speeds of 100 miles per hour."},{"The Eiffel Tower in Paris is 1,083 feet tall. It was completed in 1889 and attracts millions of visitors every year.","It has a diameter of about 86,881 miles. Jupiter also has 79 known moons orbiting it.","A group of flamingos is called a 'flamboyance.' They are known for their bright pink feathers.","The cheetah is the fastest land animal, capable of reaching speeds up to 60-70 miles per hour.","Sharks have been around for over 400 million years, making them older than dinosaurs. They have survived five mass extinctions.","Mount Kilimanjaro in Tanzania is the tallest free-standing mountain in the world at 19,341 feet.","The hummingbird is the only bird that can fly backwards. Its wings beat up to 80 times per second.","Venus is the hottest planet in the solar system, with surface temperatures around 900 degrees Fahrenheit.","Ostriches are the largest birds in the world and can run up to 45 miles per hour.","The Great Barrier Reef is the largest coral reef system in the world, stretching over 1,400 miles. It is home to a diverse range of marine life, including over 1,500 species of fish."}};
    String[][] levelD ={{"He reads a book every night before going to bed, finding solace in the pages and a chance to escape into different stories.","His collection of novels and biographies has grown considerably over the years.","The vibrant red roses stand in sharp contrast to the cool blue hydrangeas, creating a picturesque and eye-catching display that enhances the beauty of the outdoor space.","The aisles were stocked with a variety of products, and after picking up the milk, they also grabbed some bread, eggs, and fresh vegetables before heading home.","They went to the store to buy milk, along with a few other groceries they needed for the week.","The bird sings in the tree outside the window, its melodious tunes filling the air with a sense of calm and serenity.","Its song varies throughout the day, creating a delightful and soothing soundtrack to the surroundings.","The gentle rustle of leaves in the evening breeze provides a soothing backdrop as the sun sets, casting a warm glow over the landscape.","The interplay of light and shadow creates a tranquil and picturesque scene that is both calming and beautiful.","The park is a vibrant tapestry of colors with its mix of green grass and blooming flowers."},{"The Statue of Liberty in New York was a gift from France to the United States. Completed in 1886, it stands 305 feet tall and welcomes millions of visitors each year.","The Grand Canyon in Arizona is an enormous natural wonder. It stretches for 277 miles in length and reaches up to 18 miles in width.","This breathtaking canyon attracts tourists from all over the world who come to admire its vast and colorful landscape.","The Moon is approximately 238,855 miles away from Earth. It is the fifth largest moon in our solar system and plays a crucial role in controlling Earth's tides.","Bananas are the most popular fruit globally, with over 100 billion bananas consumed each year.","They are a rich source of vitamins and minerals, making them a healthy snack choice. Bananas are grown in many tropical regions around the world.","A baby kangaroo is called a joey. When a joey is born, it is about the size of a jellybean and crawls into its mother's pouch to continue growing.","Honeybees have the remarkable ability to recognize human faces. They use this skill to remember which people have approached their hive.","The Great Wall of China is an incredibly long structure, stretching over 13,000 miles. Built over many centuries, it was originally constructed to protect Chinese states from invaders.","The wall is one of the most famous landmarks in the world and can be seen from space."},{"The Amazon Rainforest is the largest tropical rainforest on the planet, covering an expansive area of over 5.5 million square kilometers. Often dubbed the lungs of the Earth, it is responsible for producing approximately 20% of the world's oxygen.","Situated in the Himalayas, straddling the border between Nepal and Tibet, Everest attracts climbers from across the globe, drawn by the challenge of its extreme altitude and severe weather conditions.","The Pacific Ocean is the most extensive and profound oceanic expanse on Earth, spanning more than 63 million square miles. Its deepest point, the Mariana Trench, plunges to a staggering depth of about 36,000 feet.","Originally constructed to defend against invasions, this monumental structure is a marvel of engineering, built over several dynasties with the labor of millions.","Honeybees are vital pollinators that play a crucial role in global agriculture. They possess the extraordinary ability to recognize and recall human faces, aiding them in identifying hive visitors.","Honeybees produce honey, a substance cherished for its sweetness and medicinal properties, and their pollination activities are essential for the production of many crops.","The Grand Canyon, a striking geological formation in Arizona, extends approximately 277 miles in length and reaches up to 18 miles in width.","Carved by the Colorado River over millions of years, this breathtaking chasm offers dramatic vistas and is a renowned destination for tourists and outdoor enthusiasts seeking to experience its majestic beauty.","It is renowned for its formidable magnetic field and numerous moons, including the four largest, known as the Galilean moons: Io, Europa, Ganymede, and Callisto.","The Statue of Liberty, an emblem of freedom and democracy, was a monumental gift from France to the United States. Standing at 305 feet tall, this iconic statue was completed in 1886 and is situated on Liberty Island in New York Harbor."}};
    String[][] levelE ={{"In the labyrinth of human desire, the Sisyphean struggle of self realization mirrors the existential quest for meaning in a world devoid of inherent purpose.","The brooding shadows of the Gothic novel pervade the narrative, where the specter of the past haunts the present, and the line between reality and the supernatural becomes irrevocably blurred.","The ineffable beauty of nature, rendered in lush, evocative prose, evokes a transcendental harmony that underscores the profound interconnectedness of all living things.","The stream-of-consciousness technique unfurls the inner workings of the mind with unfiltered immediacy, capturing the tumultuous flux of thoughts and emotions that define human consciousness.","The satirical edge of the narrative deftly dissects the absurdities of societal conventions, exposing the inherent contradictions and hypocrisies that underpin the veneer of civility.","In the tragicomedy of human existence, the interplay of laughter and sorrow reflects the paradoxical nature of life, where moments of joy and despair are inextricably intertwined.","The allegorical dimensions of the narrative invite readers to decipher layers of symbolic meaning, revealing a complex interplay between the concrete and the abstract.","The lyrical prose, suffused with a melancholic cadence, navigates the fragile boundaries between memory and reality, evoking a poignant reflection on the passage of time and the ephemeral nature of human experience.","In the postcolonial narrative, the deconstruction of imperialist tropes exposes the enduring legacies of colonialism and the multifaceted struggles of identity and resistance in a postcolonial context.","The metafictional approach foregrounds the self-referential nature of the text, blurring the boundaries between fiction and reality, and inviting readers to engage critically with the construct of narrative itself."},{"In the sprawling tapestry of postmodern narratives, the deconstruction of grand historical and cultural narratives reveals the fluidity of truth and the multiplicity of perspectives that challenge the very notion of an objective reality.","The elegiac quality of the prose, suffused with a sense of inexorable loss and nostalgia, evokes a profound meditation on the ephemeral nature of human achievements and the inevitable passage of time.","The intricate interplay of symbolism and mythopoeia in the text constructs a rich, multi-layered allegory, where the ostensibly mundane events are imbued with profound existential and philosophical significance.","In the soliloquies of Shakespearean drama, the introspective depth of character exploration serves to unravel the profound complexities of human nature, revealing the discord between inner turmoil and outward appearance.","The metatextual critique embedded within the narrative self-consciously engages with the conventions of storytelling, challenging the reader to interrogate the boundaries between fiction and reality and the construction of narrative truth.","The narrative’s polyphonic structure, characterized by its multiple, intersecting voices, provides a kaleidoscopic view of human experience, reflecting the fractured and multifaceted nature of contemporary existence.","In the tapestry of existentialist thought, the protagonist's relentless pursuit of authenticity amidst an absurd and indifferent universe underscores the philosophical imperative of self-determination and the search for inherent meaning.","The transgressive elements within the narrative subvert traditional moral and social boundaries, compelling readers to confront the disruptive and often unsettling aspects of human behavior and societal norms.","The lyrical cadence of the narrative prose weaves a rich tapestry of sensory imagery and introspective reflection, evoking the poignant resonance of human experience and the often-elusive quest for inner harmony.","The intricacies of stream-of-consciousness technique reveal the fragmented, non-linear nature of thought and perception, capturing the ephemeral and often chaotic flow of consciousness with remarkable immediacy and authenticity."},{"The ontological enigmas explored within the text unfurl a meta-narrative wherein the very fabric of reality is interrogated through a hyper-reflective lens, deconstructing the dichotomy between the ephemeral and the eternal while subverting conventional epistemological certainties.","The juxtaposition of diaphanous imagery and metaphysical inquiry in the narrative evokes a sublime interplay between the corporeal and the ethereal, engendering a dialectical tension that illuminates the paradoxical nature of human existence and the metaphysical void.","In the labyrinthine prose of the post-structuralist oeuvre, the narrative disassembles traditional semiotic structures, challenging the stability of signifiers and destabilizing the reader's comprehension of meaning through an intricate play of intertextual references and signifying chains.","The narrative’s allegorical resonance reverberates through a complex lattice of interwoven mythological and philosophical allusions, where each layer of symbolism meticulously constructs a richly textured tableau of existential inquiry and ontological exploration.","The text's inherent meta fictionality, characterized by its self-reflexive interrogation of narrative conventions and the ontological status of fictional worlds, prompts a profound philosophical engagement with the nature of reality and the boundaries of literary imagination.","Through a kaleidoscopic narrative prism, the novel enacts a profound critique of linear temporality and singularity of perspective, employing a polyvocal structure that both amplifies and disorients the reader's apprehension of temporal and spatial dimensions.","The juxtaposition of esoteric symbolism with existential angst in the text serves as a profound meditation on the inherent absurdity of human endeavor, engendering a dialectical exploration of the absurd and the sublime within the context of a disenchanted universe.","The author’s sophisticated deployment of pastiche and intertextuality manifests a metafictional commentary on the nature of narrative authenticity, wherein the boundaries between original and derivative texts are artfully blurred to question the essence of literary creation.","The nuanced interplay of psychological depth and narrative ambiguity in the text creates a disquieting tableau wherein the boundaries of identity and consciousness are rigorously interrogated, unraveling the intricate fabric of subjective reality.","The narrative's eloquent and labyrinthine prose evokes a grandiose synthesis of intellectual and emotional realms, reflecting a profound engagement with philosophical paradoxes and existential dilemmas that transcend conventional literary form and narrative cohesion."}};
    
    String checkLevel="Default";//Level eka mokakda kiyala thorana eka
    String[][] levelWords;//level wala wakya walata adala 
    String[] sentences1;
    String[] sentences2;
    String typeWords;
    String[][] typecheckWords;
    double[] correctWordPrasentage;
    double[] netSpeed;
    double[] wordsPerMinute;
    int[] lessTypeWords;
    int typeTime,runCount,count0,count1,typewordCount,correctcount,countB,countC,levelWordCount,oneTypeCount,levelResultcount,minute1,hour1,minute2,hour2,second1,second2,allSecond1,allSecond2;
    double netSpeedAverage;
    
    public okayAllLevels()
    {
        typeTime=0;
        runCount=0;
        count0=0;
        count1=0;
        typewordCount=0;
        correctcount=0;
        countC=0;
        levelWordCount=0;
        levelResultcount=0;
        minute1=0;
        hour1=0;
        minute2=0;
        hour2=0;
        second1=0;
        second2=0;
        allSecond1=0;
        allSecond2=0;
        netSpeedAverage=0;

        levelWords = new String[5][10];
        typecheckWords = new String[5][10];
        correctWordPrasentage= new double[3];
        netSpeed  = new double[3];
        lessTypeWords  = new int [3];
        wordsPerMinute = new double[3];
    }
    public void Game()
    {
        for ( ; countC<=10;countC++)
        {
            //Level eka thora ganna eka
            if(netSpeedAverage > 30 && netSpeedAverage<50)
            {
                System.out.println("You can select Avealable Missions");
                System.out.println("01.Slow");
                System.out.println("02.Quit");                
                System.out.print("Enter Your Choise = ");
                checkLevel=getdata.nextLine();
                System.out.println("");                
                countC = 0;
                netSpeed[0] = 0;
                netSpeed[1] = 0;
                netSpeed[2] = 0;
                netSpeedAverage=0;

            }
            if(netSpeedAverage > 50 && netSpeedAverage<70)
            {
                System.out.println("01.Slow");
                System.out.println("02.Average");
                System.out.println("03.Quit");
                System.out.print("Enter Your Choise = ");
                checkLevel=getdata.nextLine();
                System.out.println("");     
                countC = 0;
                netSpeed[0] = 0;
                netSpeed[1] = 0;
                netSpeed[2] = 0;
                netSpeedAverage=0;
                
            }
             if(netSpeedAverage > 70 && netSpeedAverage<90)
            {
                System.out.println("01.Slow");
                System.out.println("02.Average");
                System.out.println("03.Fluent");
                System.out.println("04.Quit");
                System.out.print("Enter Your Choise = ");
                checkLevel=getdata.nextLine();
                System.out.println(""); 
                countC = 0;
                netSpeed[0] = 0;
                netSpeed[1] = 0;
                netSpeed[2] = 0;
                netSpeedAverage=0;
            }
              if(netSpeedAverage > 90 && netSpeedAverage<100)
            {
                System.out.println("01.Slow");
                System.out.println("02.Average");
                System.out.println("03.Fluent");
                System.out.println("04.Pro");
                System.out.println("05.Quit");
                System.out.print("Enter Your Choise = ");
                checkLevel=getdata.nextLine();
                System.out.println(""); 
                countC = 0;
                netSpeed[0] = 0;
                netSpeed[1] = 0;
                netSpeed[2] = 0;
                netSpeedAverage=0;
            }
            if(checkLevel.equals("Quit"))
            {
                System.out.println("Thank You Come again");
                countC=20;
                
            }
            
            if (checkLevel.equals("Default")&& count1==0 && typewordCount==0)
            {
                System.out.println("You selected Default level and Continu tasks");
                LocalTime currentTime1 = LocalTime.now();
                hour1 = currentTime1.getHour();
                minute1 = currentTime1.getMinute();
                second1 = currentTime1.getSecond();
            }
            if (checkLevel.equals("Slow")&& count1==0 && typewordCount==0)
            {
                System.out.println("You selected Avarage level and Continu tasks");
                LocalTime currentTime2 = LocalTime.now();
                hour1 = currentTime2.getHour();
                minute1 = currentTime2.getMinute();
                second1 = currentTime2.getSecond();
            }        
            if (checkLevel.equals("Average")&& count1==0 && typewordCount==0)
            {
                System.out.println("You selected Avarage level and Continu tasks");
                LocalTime currentTime3 = LocalTime.now();
                hour1 = currentTime3.getHour();
                minute1 = currentTime3.getMinute();
                second1 = currentTime3.getSecond();
            }        
            if (checkLevel.equals("Fluent")&& count1==0 && typewordCount==0)
            {
                System.out.println("You selected Fluent level and Continu tasks");
                LocalTime currentTime4 = LocalTime.now();
                hour1 = currentTime4.getHour();
                minute1 = currentTime4.getMinute();
                second1 = currentTime4.getSecond();
            }
            if (checkLevel.equals("Pro")&& count1==0 && typewordCount==0)
            {
                System.out.println("You selected Pro level and Continu tasks");
                LocalTime currentTime5 = LocalTime.now();
                hour1 = currentTime5.getHour();
                minute1 = currentTime5.getMinute();
                second1 = currentTime5.getSecond();
            }
            //Default level
            if (checkLevel.equals("Default"))
            {
                
                System.out.println((count1+1)+"."+(levelA[count0][count1]));// Wakya Print Karanawa
                sentences1 = levelA[count0][count1].split("[ ]");//wakaye wachana kadanawa
                countB=0;
                for (String sentence : sentences1) 
                {
                    for (int countA=0;countA==0; countA++) //me For eken karanne wachane wachane wena wenama array ekata da ganbnawa
                    {
                        sentence = sentence.trim();
                        levelWords[count0][countB]= sentence;
                        levelWordCount++;
                    }
                    countB++;
                } 
                typeWords= getdata.nextLine();//User input ganna veriable eka
                sentences2 = typeWords.split("[ ]"); //userinput wachana kadana eka
                countB=0;
                oneTypeCount=0;
                for (String sentence : sentences2) 
                {
                    for (int countA=0;countA==0; countA++)
                    {
                        sentence = sentence.trim();
                        typecheckWords[count0][countB]= sentence;
                        oneTypeCount++;//eka wakyaka wachana gaana
                        typewordCount++;//sampurna wachana gaana
                    }
                    countB++;
                }
                for (int countD=0; countD<oneTypeCount;countD++)
                {
                    if ((levelWords[count0][countD]).equals(typecheckWords[count0][countD]))
                    {
                        correctcount++;
                    }
                }
                count1++;// anith wayata array eka maru karanawa
                runCount++;
            }            
            if (runCount==2)
            {
                LocalTime currentTime1 = LocalTime.now();
                hour2 = currentTime1.getHour();
                minute2 = currentTime1.getMinute();
                second2 = currentTime1.getSecond();
                allSecond1=(hour1*3600)+(minute1*60)+second1;
                allSecond2=(hour2*3600)+(minute2*60)+second2;
                typeTime=allSecond2-allSecond1;
                wordsPerMinute[count0] = (typewordCount*60)/typeTime;
                correctWordPrasentage[count0] = (correctcount/typewordCount)*100;
                lessTypeWords[count0] = levelWordCount-typewordCount;
                netSpeed[count0] = (typewordCount-(typewordCount-correctcount))*(wordsPerMinute[count0]);
                
                System.out.println("Words per minute "+ (wordsPerMinute[count0])+" wmp");
                System.out.println("Same words presantage is = "+correctWordPrasentage[count0]+"%");
                System.out.println("Net Speed is = "+netSpeed[count0]);
                System.out.println("not typed words = "+lessTypeWords[count0]);
                System.out.println("winadiyata gahapu wachana ganana = "+typewordCount);

                if(netSpeed[0]<20 && 20>netSpeed[1] && netSpeed[2]<20)
                {
                    count1=0;
                    count0=0;
                    countC=0;
                    runCount=0;
                    correctcount=0;
                    levelWordCount=0;
                    typewordCount=0;
                    System.out.println("");
                    System.out.println("Please Continu Default Level 1");  
                }
                if (netSpeed[0]>=20 && netSpeed[1]<20 && netSpeed[2]<20)
                {
                    count1=0;
                    count0=1;
                    countC=0;
                    correctcount=0;
                    levelWordCount=0;
                    typewordCount=0;
                    System.out.println("");
                    if(netSpeed[0]>=20 && levelResultcount<2)
                    {
                        System.out.println("You Can go Default Level 2");
                    }
                    else
                    {
                        System.out.println("Please Continu Default Level 1");
                    }
                    levelResultcount++;
                    runCount=0;   
                }
                if (netSpeed[1]>=20 && netSpeed[0]>=20 && netSpeed[2]<20)
                {
                    count1=0;
                    count0=2;
                    countC=0;
                    correctcount=0;
                    levelWordCount=0;
                    typewordCount=0;
                    System.out.println("");
                    if(netSpeed[1]>=20 && levelResultcount<2)
                    {
                        System.out.println("You Can go Default Level 3");
                    }
                    else
                    {
                        System.out.println("Please Continu Default Level 2");
                    }
                    levelResultcount++;
                    runCount=0;
                }
                if (netSpeed[1]>=20 && netSpeed[0]>=20 && netSpeed[2]>20)
                {
                    count1=0;
                    count0=0;
                    countC=0;
                    correctcount=0;
                    levelWordCount=0;
                    typewordCount=0;
                    System.out.println("");
                    if(netSpeed[2]>=20 && levelResultcount<2)
                    {
                       System.out.println("Please Continu Default Level 3"); 
                    }
                    else
                    {
                        System.out.println("You Can go Next Mission");
                        System.out.println("");
                        netSpeedAverage=(netSpeed[0]+netSpeed[1]+netSpeed[2])/3;
                    }
                    levelResultcount++;
                    runCount=0;
                } 
            }
            
           //Slow level
            if (checkLevel.equals("Slow"))
            {
                
                System.out.println((count1+1)+"."+(levelB[count0][count1]));// Wakya Print Karanawa
                sentences1 = levelB[count0][count1].split("[ ]");//wakaye wachana kadanawa
                countB=0;
                for (String sentence : sentences1) 
                {
                    for (int countA=0;countA==0; countA++) //me For eken karanne wachane wachane wena wenama array ekata da ganbnawa
                    {
                        sentence = sentence.trim();
                        levelWords[count0][countB]= sentence;
                        levelWordCount++;
                    }
                    countB++;
                } 
                typeWords= getdata.nextLine();//User input ganna veriable eka
                sentences2 = typeWords.split("[ ]"); //userinput wachana kadana eka
                countB=0;
                oneTypeCount=0;
                for (String sentence : sentences2) 
                {
                    for (int countA=0;countA==0; countA++)
                    {
                        sentence = sentence.trim();
                        typecheckWords[count0][countB]= sentence;
                        oneTypeCount++;//eka wakyaka wachana gaana
                        typewordCount++;//sampurna wachana gaana
                    }
                    countB++;
                }
                for (int countD=0; countD<oneTypeCount;countD++)
                {
                    if ((levelWords[count0][countD]).equals(typecheckWords[count0][countD]))
                    {
                        correctcount++;
                    }
                }
                count1++;// anith wayata array eka maru karanawa
                runCount++;
            }            
            if (runCount==2)
            {
                LocalTime currentTime1 = LocalTime.now();
                hour2 = currentTime1.getHour();
                minute2 = currentTime1.getMinute();
                second2 = currentTime1.getSecond();
                allSecond1=(hour1*3600)+(minute1*60)+second1;
                allSecond2=(hour2*3600)+(minute2*60)+second2;
                typeTime=allSecond2-allSecond1;
                wordsPerMinute[count0] = (typewordCount*60)/typeTime;
                correctWordPrasentage[count0] = correctcount/typewordCount*100;
                lessTypeWords[count0] = levelWordCount-typewordCount;
                netSpeed[count0] = (typewordCount-(typewordCount-correctcount))*(wordsPerMinute[count0]);
                
                System.out.println("Words per minute "+ (wordsPerMinute[count0])+" wmp");
                System.out.println("Same words presantage is = "+correctWordPrasentage[count0]+"%");
                System.out.println("Net Speed is = "+netSpeed[count0]);
                System.out.println("not typed words = "+lessTypeWords[count0]);
                System.out.println("winadiyata gahapu wachana ganana = "+typewordCount);

                if(netSpeed[0]<20 && 20>netSpeed[1] && netSpeed[2]<20)
                {
                    count1=0;
                    count0=0;
                    countC=0;
                    runCount=0;
                    correctcount=0;
                    levelWordCount=0;
                    typewordCount=0;
                    System.out.println("");
                    System.out.println("Please Continu Default Level 1");  
                }
                if (netSpeed[0]>=20 && netSpeed[1]<20 && netSpeed[2]<20)
                {
                    count1=0;
                    count0=1;
                    countC=0;
                    correctcount=0;
                    levelWordCount=0;
                    typewordCount=0;
                    System.out.println("");
                    if(netSpeed[0]>=20 && levelResultcount<2)
                    {
                        System.out.println("You Can go Default Level 2");
                    }
                    else
                    {
                        System.out.println("Please Continu Default Level 1");
                    }
                    levelResultcount++;
                    runCount=0;   
                }
                if (netSpeed[1]>=20 && netSpeed[0]>=20 && netSpeed[2]<20)
                {
                    count1=0;
                    count0=2;
                    countC=0;
                    correctcount=0;
                    levelWordCount=0;
                    typewordCount=0;
                    System.out.println("");
                    if(netSpeed[1]>=20 && levelResultcount<2)
                    {
                        System.out.println("You Can go Default Level 3");
                    }
                    else
                    {
                        System.out.println("Please Continu Default Level 2");
                    }
                    levelResultcount++;
                    runCount=0;
                }
                if (netSpeed[1]>=20 && netSpeed[0]>=20 && netSpeed[2]>20)
                {
                    count1=0;
                    count0=0;
                    countC=0;
                    correctcount=0;
                    levelWordCount=0;
                    typewordCount=0;
                    System.out.println("");
                    if(netSpeed[2]>=20 && levelResultcount<2)
                    {
                       System.out.println("Please Continu Default Level 3"); 
                    }
                    else
                    {
                        System.out.println("You Can go Next Mission");
                        System.out.println("");
                        netSpeedAverage=(netSpeed[0]+netSpeed[1]+netSpeed[2])/3;  
                    }
                    levelResultcount++;
                    runCount=0;
                } 
            }
            //Average level
            if (checkLevel.equals("Average"))
            {
                
                System.out.println((count1+1)+"."+(levelC[count0][count1]));// Wakya Print Karanawa
                sentences1 = levelC[count0][count1].split("[ ]");//wakaye wachana kadanawa
                countB=0;
                for (String sentence : sentences1) 
                {
                    for (int countA=0;countA==0; countA++) //me For eken karanne wachane wachane wena wenama array ekata da ganbnawa
                    {
                        sentence = sentence.trim();
                        levelWords[count0][countB]= sentence;
                        levelWordCount++;
                    }
                    countB++;
                } 
                typeWords= getdata.nextLine();//User input ganna veriable eka
                sentences2 = typeWords.split("[ ]"); //userinput wachana kadana eka
                countB=0;
                oneTypeCount=0;
                for (String sentence : sentences2) 
                {
                    for (int countA=0;countA==0; countA++)
                    {
                        sentence = sentence.trim();
                        typecheckWords[count0][countB]= sentence;
                        oneTypeCount++;//eka wakyaka wachana gaana
                        typewordCount++;//sampurna wachana gaana
                    }
                    countB++;
                }
                for (int countD=0; countD<oneTypeCount;countD++)
                {
                    if ((levelWords[count0][countD]).equals(typecheckWords[count0][countD]))
                    {
                        correctcount++;
                    }
                }
                count1++;// anith wayata array eka maru karanawa
                runCount++;
            }            
            if (runCount==2)
            {
                LocalTime currentTime1 = LocalTime.now();
                hour2 = currentTime1.getHour();
                minute2 = currentTime1.getMinute();
                second2 = currentTime1.getSecond();
                allSecond1=(hour1*3600)+(minute1*60)+second1;
                allSecond2=(hour2*3600)+(minute2*60)+second2;
                typeTime=allSecond2-allSecond1;
                wordsPerMinute[count0] = (typewordCount*60)/typeTime;
                correctWordPrasentage[count0] = correctcount/typewordCount*100;
                lessTypeWords[count0] = levelWordCount-typewordCount;
                netSpeed[count0] = (typewordCount-(typewordCount-correctcount))*(wordsPerMinute[count0]);
                
                System.out.println("Words per minute "+ (wordsPerMinute[count0])+" wmp");
                System.out.println("Same words presantage is = "+correctWordPrasentage[count0]+"%");
                System.out.println("Net Speed is = "+netSpeed[count0]);
                System.out.println("not typed words = "+lessTypeWords[count0]);
                System.out.println("winadiyata gahapu wachana ganana = "+typewordCount);

                if(netSpeed[0]<20 && 20>netSpeed[1] && netSpeed[2]<20)
                {
                    count1=0;
                    count0=0;
                    countC=0;
                    runCount=0;
                    correctcount=0;
                    levelWordCount=0;
                    typewordCount=0;
                    System.out.println("");
                    System.out.println("Please Continu Default Level 1");  
                }
                if (netSpeed[0]>=20 && netSpeed[1]<20 && netSpeed[2]<20)
                {
                    count1=0;
                    count0=1;
                    countC=0;
                    correctcount=0;
                    levelWordCount=0;
                    typewordCount=0;
                    System.out.println("");
                    if(netSpeed[0]>=20 && levelResultcount<2)
                    {
                        System.out.println("You Can go Default Level 2");
                    }
                    else
                    {
                        System.out.println("Please Continu Default Level 1");
                    }
                    levelResultcount++;
                    runCount=0;   
                }
                if (netSpeed[1]>=20 && netSpeed[0]>=20 && netSpeed[2]<20)
                {
                    count1=0;
                    count0=2;
                    countC=0;
                    correctcount=0;
                    levelWordCount=0;
                    typewordCount=0;
                    System.out.println("");
                    if(netSpeed[1]>=20 && levelResultcount<2)
                    {
                        System.out.println("You Can go Default Level 3");
                    }
                    else
                    {
                        System.out.println("Please Continu Default Level 2");
                    }
                    levelResultcount++;
                    runCount=0;
                }
                if (netSpeed[1]>=20 && netSpeed[0]>=20 && netSpeed[2]>20)
                {
                    count1=0;
                    count0=0;
                    countC=0;
                    correctcount=0;
                    levelWordCount=0;
                    typewordCount=0;
                    System.out.println("");
                    if(netSpeed[2]>=20 && levelResultcount<2)
                    {
                       System.out.println("Please Continu Default Level 3"); 
                    }
                    else
                    {
                        System.out.println("You Can go Next Mission");
                        System.out.println("");
                         netSpeedAverage=(netSpeed[0]+netSpeed[1]+netSpeed[2])/3; 
                    }
                    levelResultcount++;
                    runCount=0;
                } 
            }
            //Fluent level
            if (checkLevel.equals("Fluent"))
            {
                
                System.out.println((count1+1)+"."+(levelD[count0][count1]));// Wakya Print Karanawa
                sentences1 = levelD[count0][count1].split("[ ]");//wakaye wachana kadanawa
                countB=0;
                for (String sentence : sentences1) 
                {
                    for (int countA=0;countA==0; countA++) //me For eken karanne wachane wachane wena wenama array ekata da ganbnawa
                    {
                        sentence = sentence.trim();
                        levelWords[count0][countB]= sentence;
                        levelWordCount++;
                    }
                    countB++;
                } 
                typeWords= getdata.nextLine();//User input ganna veriable eka
                sentences2 = typeWords.split("[ ]"); //userinput wachana kadana eka
                countB=0;
                oneTypeCount=0;
                for (String sentence : sentences2) 
                {
                    for (int countA=0;countA==0; countA++)
                    {
                        sentence = sentence.trim();
                        typecheckWords[count0][countB]= sentence;
                        oneTypeCount++;//eka wakyaka wachana gaana
                        typewordCount++;//sampurna wachana gaana
                    }
                    countB++;
                }
                for (int countD=0; countD<oneTypeCount;countD++)
                {
                    if ((levelWords[count0][countD]).equals(typecheckWords[count0][countD]))
                    {
                        correctcount++;
                    }
                }
                count1++;// anith wayata array eka maru karanawa
                runCount++;
            }            
            if (runCount==2)
            {
                LocalTime currentTime1 = LocalTime.now();
                hour2 = currentTime1.getHour();
                minute2 = currentTime1.getMinute();
                second2 = currentTime1.getSecond();
                allSecond1=(hour1*3600)+(minute1*60)+second1;
                allSecond2=(hour2*3600)+(minute2*60)+second2;
                typeTime=allSecond2-allSecond1;
                wordsPerMinute[count0] = (typewordCount*60)/typeTime;
                correctWordPrasentage[count0] = correctcount/typewordCount*100;
                lessTypeWords[count0] = levelWordCount-typewordCount;
                netSpeed[count0] = (typewordCount-(typewordCount-correctcount))*(wordsPerMinute[count0]);
                
                System.out.println("Words per minute "+ (wordsPerMinute[count0])+" wmp");
                System.out.println("Same words presantage is = "+correctWordPrasentage[count0]+"%");
                System.out.println("Net Speed is = "+netSpeed[count0]);
                System.out.println("not typed words = "+lessTypeWords[count0]);
                System.out.println("winadiyata gahapu wachana ganana = "+typewordCount);

                if(netSpeed[0]<20 && 20>netSpeed[1] && netSpeed[2]<20)
                {
                    count1=0;
                    count0=0;
                    countC=0;
                    runCount=0;
                    correctcount=0;
                    levelWordCount=0;
                    typewordCount=0;
                    System.out.println("");
                    System.out.println("Please Continu Default Level 1");  
                }
                if (netSpeed[0]>=20 && netSpeed[1]<20 && netSpeed[2]<20)
                {
                    count1=0;
                    count0=1;
                    countC=0;
                    correctcount=0;
                    levelWordCount=0;
                    typewordCount=0;
                    System.out.println("");
                    if(netSpeed[0]>=20 && levelResultcount<2)
                    {
                        System.out.println("You Can go Default Level 2");
                    }
                    else
                    {
                        System.out.println("Please Continu Default Level 1");
                    }
                    levelResultcount++;
                    runCount=0;   
                }
                if (netSpeed[1]>=20 && netSpeed[0]>=20 && netSpeed[2]<20)
                {
                    count1=0;
                    count0=2;
                    countC=0;
                    correctcount=0;
                    levelWordCount=0;
                    typewordCount=0;
                    System.out.println("");
                    if(netSpeed[1]>=20 && levelResultcount<2)
                    {
                        System.out.println("You Can go Default Level 3");
                    }
                    else
                    {
                        System.out.println("Please Continu Default Level 2");
                    }
                    levelResultcount++;
                    runCount=0;
                }
                if (netSpeed[1]>=20 && netSpeed[0]>=20 && netSpeed[2]>20)
                {
                    count1=0;
                    count0=0;
                    countC=0;
                    correctcount=0;
                    levelWordCount=0;
                    typewordCount=0;
                    System.out.println("");
                    if(netSpeed[2]>=20 && levelResultcount<2)
                    {
                       System.out.println("Please Continu Default Level 3"); 
                    }
                    else
                    {
                        System.out.println("You Can go Next Mission");
                        System.out.println("");
                         netSpeedAverage=(netSpeed[0]+netSpeed[1]+netSpeed[2])/3; 
                    }
                    levelResultcount++;
                    runCount=0;
                } 
            }
            //Pro level
            if (checkLevel.equals("Pro"))
            {
                
                System.out.println((count1+1)+"."+(levelE[count0][count1]));// Wakya Print Karanawa
                sentences1 = levelE[count0][count1].split("[ ]");//wakaye wachana kadanawa
                countB=0;
                for (String sentence : sentences1) 
                {
                    for (int countA=0;countA==0; countA++) //me For eken karanne wachane wachane wena wenama array ekata da ganbnawa
                    {
                        sentence = sentence.trim();
                        levelWords[count0][countB]= sentence;
                        levelWordCount++;
                    }
                    countB++;
                } 
                typeWords= getdata.nextLine();//User input ganna veriable eka
                sentences2 = typeWords.split("[ ]"); //userinput wachana kadana eka
                countB=0;
                oneTypeCount=0;
                for (String sentence : sentences2) 
                {
                    for (int countA=0;countA==0; countA++)
                    {
                        sentence = sentence.trim();
                        typecheckWords[count0][countB]= sentence;
                        oneTypeCount++;//eka wakyaka wachana gaana
                        typewordCount++;//sampurna wachana gaana
                    }
                    countB++;
                }
                for (int countD=0; countD<oneTypeCount;countD++)
                {
                    if ((levelWords[count0][countD]).equals(typecheckWords[count0][countD]))
                    {
                        correctcount++;
                    }
                }
                count1++;// anith wayata array eka maru karanawa
                runCount++;
            }            
            if (runCount==2)
            {
                LocalTime currentTime1 = LocalTime.now();
                hour2 = currentTime1.getHour();
                minute2 = currentTime1.getMinute();
                second2 = currentTime1.getSecond();
                allSecond1=(hour1*3600)+(minute1*60)+second1;
                allSecond2=(hour2*3600)+(minute2*60)+second2;
                typeTime=allSecond2-allSecond1;
                wordsPerMinute[count0] = (typewordCount*60)/typeTime;
                correctWordPrasentage[count0] = correctcount/typewordCount*100;
                lessTypeWords[count0] = levelWordCount-typewordCount;
                netSpeed[count0] = (typewordCount-(typewordCount-correctcount))*(wordsPerMinute[count0]);
                
                System.out.println("Words per minute "+ (wordsPerMinute[count0])+" wmp");
                System.out.println("Same words presantage is = "+correctWordPrasentage[count0]+"%");
                System.out.println("Net Speed is = "+netSpeed[count0]);
                System.out.println("not typed words = "+lessTypeWords[count0]);
                System.out.println("winadiyata gahapu wachana ganana = "+typewordCount);

                if(netSpeed[0]<20 && 20>netSpeed[1] && netSpeed[2]<20)
                {
                    count1=0;
                    count0=0;
                    countC=0;
                    runCount=0;
                    correctcount=0;
                    levelWordCount=0;
                    typewordCount=0;
                    System.out.println("");
                    System.out.println("Please Continu Default Level 1");  
                }
                if (netSpeed[0]>=20 && netSpeed[1]<20 && netSpeed[2]<20)
                {
                    count1=0;
                    count0=1;
                    countC=0;
                    correctcount=0;
                    levelWordCount=0;
                    typewordCount=0;
                    System.out.println("");
                    if(netSpeed[0]>=20 && levelResultcount<2)
                    {
                        System.out.println("You Can go Default Level 2");
                    }
                    else
                    {
                        System.out.println("Please Continu Default Level 1");
                    }
                    levelResultcount++;
                    runCount=0;   
                }
                if (netSpeed[1]>=20 && netSpeed[0]>=20 && netSpeed[2]<20)
                {
                    count1=0;
                    count0=2;
                    countC=0;
                    correctcount=0;
                    levelWordCount=0;
                    typewordCount=0;
                    System.out.println("");
                    if(netSpeed[1]>=20 && levelResultcount<2)
                    {
                        System.out.println("You Can go Default Level 3");
                    }
                    else
                    {
                        System.out.println("Please Continu Default Level 2");
                    }
                    levelResultcount++;
                    runCount=0;
                }
                if (netSpeed[1]>=20 && netSpeed[0]>=20 && netSpeed[2]>20)
                {
                    count1=0;
                    count0=0;
                    countC=0;
                    correctcount=0;
                    levelWordCount=0;
                    typewordCount=0;
                    System.out.println("");
                    if(netSpeed[2]>=20 && levelResultcount<2)
                    {
                       System.out.println("Please Continu Default Level 3"); 
                    }
                    else
                    {
                        System.out.println("You Can go Next Mission");
                        System.out.println("");
                        netSpeedAverage=(netSpeed[0]+netSpeed[1]+netSpeed[2])/3;  
                    }
                    levelResultcount++;
                    runCount=0;
                } 
            }
        }        
    }
     public static void main(String[] args) 
     {        
             okayAllLevels test = new okayAllLevels();
             test.Game();    
    }
}