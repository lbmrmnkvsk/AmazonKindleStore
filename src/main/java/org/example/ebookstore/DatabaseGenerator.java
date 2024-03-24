package org.example.ebookstore;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseGenerator implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        generatePublishers();
        generateAuthors();
        generateCategories();
        generateBooks();
    }

    public void generatePublishers() {
        // array size 152
        String[] publisherNames = {
                "Global Reads Publishing", "Future House Publishing", "Eclipse Publishing", "Nova Editions",
                "Pioneer Press", "Crimson Leaf Publishing", "Blue Horizon Books", "Twilight Publishing House",
                "New Dawn Publications", "Horizon Books", "Quantum Press", "Infinity Publishing",
                "Beyond Books", "Galactic Press", "Mystic Sea Publications", "Phoenix Rising Press",
                "Silver Moon Press", "Starlight Publishing", "Twilight Tales", "Voyager Books",
                "Wildflower Publishing", "Zenith Press", "Aurora Publications", "Cosmic Books",
                "Dreamscape Publishing", "Eternal Press", "Fountain of Knowledge Publishing",
                "Golden Age Publications", "Harmony Books", "Illuminated Editions",
                "Journeyman Press", "Kindred Spirits Publishing", "Luminous Literary Press",
                "Moonbeam Publications", "Nebula Press", "Oasis Publications",
                "Paradigm Publishers", "Quest Books", "Renaissance Publishing House",
                "Sapphire Books", "Terra Firma Publishing", "Universal Books",
                "Vanguard Press", "Whispering Winds Press", "Xanadu Publications",
                "Yellow Sun Press", "Zephyr Books", "Alpha Waves Publications",
                "Brave New World Press", "Chronicle Books", "Dawn Treader Press",
                "Echo Point Books", "Fable Forge Press", "Gossamer Wings Publishing",
                "High Tide Publishing", "Infinite Ideas Books", "Jubilee Editions",
                "Kaleidoscope Books", "Legendary Press", "Majestic Publishing House",
                "Nightingale Books", "Oceanview Publishing", "Pinnacle Press",
                "Quicksilver Books", "Radiant Publications", "Starfire Press",
                "Tidal Wave Books", "Umbra Editions", "Visionary Press",
                "Wilderness Press", "Expanse Publishing", "Yonder Books", "Zen Books",
                "Atlas Publishing", "Bounty Books", "Candlelight Publications", "Driftwood Press",
                "Ember Editions", "Flare Books", "Grove Press", "Haven Books",
                "Island Press", "Jade Editions", "Kismet Publishers", "Lantern Books",
                "Mosaic Press", "Nectar Press", "Orbit Books", "Pilgrim Press",
                "Quill & Quiver Publishing", "Ripple Books", "Serenity Press", "Tome & Quill",
                "Unbound Publications", "Vista Books", "Windswept House", "Xeno Press",
                "Yearning Press", "Zion Publishing", "Archway Publishing", "Beacon Press",
                "Crestview Publishing", "Dove Publications", "Evergreen Books", "Frostbite Publishing",
                "Glacier Books", "Hollow Publishing", "Iris Publishers", "Jester Books",
                "Knightly Press", "Labyrinth Books", "Mirage Publishers", "Nomad Press",
                "Olympus Publishing", "Parchment House", "Quasar Publications", "Rosewood Press",
                "Silentium Books", "Thistle Publishing", "Underwood Books", "Verdant Publishing",
                "Willow Tree Press", "Xerxes Books", "Yellow Brick Road Press", "Zodiac Publishing",
                "Avid Reader Press", "Blaze Publishing", "Crystal Clear Publications", "Dandelion Books",
                "Elysian Fields Press", "Frosting Publishing", "Glimmerglass Books", "Halo Publishing",
                "Inscribe Press", "Jubilation Publishing", "Knollwood Press", "Lyric Books",
                "Meadowbrook Press", "Nirvana Publishing", "Opal Publications", "Pristine Publishing",
                "Quintessence Publishing", "Rhapsody Books", "Snowflake Publications", "Tanglewood Press",
                "Unity Publishing", "Voyageur Press", "Whimsy Books", "Xylophone Books",
                "Yesteryear Books", "Zenith Publishing", "Accolade Publications"};

        String[] beginnings = {
                "Leading the charge in the world of", "Pioneering new frontiers in",
                "Revolutionizing the landscape of", "At the heart of innovation in",
                "Setting the standards for excellence in", "Breaking new ground in",
        };

        String[] middles = {
                "literature with a commitment to diverse voices,", "publishing, offering unparalleled stories,",
                "narrative non-fiction, exploring untold histories,", "science fiction and fantasy, crafting new worlds,",
                "educational materials, shaping the minds of tomorrow,", "romance, with a heart for every story,",
        };

        final String[] ends = {
                "this publisher stands out as a beacon of creativity.", "they are dedicated to enriching readers' shelves and lives.",
                "their catalog is a testament to enduring stories and innovation.", "they bring untold stories to life, illuminating the human experience.",
                "their commitment to quality and originality is unwavering.", "they are at the forefront of delivering compelling content."
        };

    }

    public void generateAuthors() {
        // (100, 100, 10000)
        String[] firstNames = {
                "James", "Mary", "John", "Patricia", "Robert", "Jennifer", "Michael", "Linda",
                "William", "Elizabeth", "David", "Barbara", "Richard", "Susan", "Joseph", "Jessica",
                "Thomas", "Sarah", "Charles", "Karen", "Christopher", "Nancy", "Daniel", "Lisa",
                "Matthew", "Margaret", "Anthony", "Betty", "Mark", "Sandra", "Donald", "Ashley",
                "Steven", "Kimberly", "Paul", "Emily", "Andrew", "Donna", "Joshua", "Michelle",
                "Kenneth", "Dorothy", "Kevin", "Carol", "Brian", "Amanda", "George", "Melissa",
                "Edward", "Deborah", "Ronald", "Stephanie", "Timothy", "Rebecca", "Jason", "Laura",
                "Jeffrey", "Helen", "Ryan", "Sharon", "Jacob", "Cynthia", "Gary", "Kathleen",
                "Nicholas", "Amy", "Eric", "Shirley", "Jonathan", "Angela", "Stephen", "Anna",
                "Larry", "Ruth", "Justin", "Lisa", "Scott", "Sara", "Brandon", "Kimberly",
                "Benjamin", "Denise", "Samuel", "Diana", "Gregory", "Madison", "Alexander", "Megan",
                "Jack", "Cheryl", "Dennis", "Hannah", "Jerry", "Evelyn"
        };

        String[] lastNames = {
                "Smith", "Johnson", "Williams", "Jones", "Brown", "Davis", "Miller", "Wilson",
                "Moore", "Taylor", "Anderson", "Thomas", "Jackson", "White", "Harris", "Martin",
                "Thompson", "Garcia", "Martinez", "Robinson", "Clark", "Rodriguez", "Lewis", "Lee",
                "Walker", "Hall", "Allen", "Young", "Hernandez", "King", "Wright", "Lopez", "Hill",
                "Scott", "Green", "Adams", "Baker", "Gonzalez", "Nelson", "Carter", "Mitchell",
                "Perez", "Roberts", "Turner", "Phillips", "Campbell", "Parker", "Evans", "Edwards",
                "Collins", "Stewart", "Sanchez", "Morris", "Rogers", "Reed", "Cook", "Morgan",
                "Bell", "Murphy", "Bailey", "Rivera", "Cooper", "Richardson", "Cox", "Howard",
                "Ward", "Torres", "Peterson", "Gray", "Ramirez", "James", "Watson", "Brooks",
                "Kelly", "Sanders", "Price", "Bennett", "Wood", "Barnes", "Ross", "Henderson",
                "Coleman", "Jenkins", "Perry", "Powell", "Long", "Patterson", "Hughes", "Flores",
                "Washington", "Butler", "Simmons", "Foster", "Gonzales", "Bryant", "Alexander",
                "Russell", "Griffin", "Diaz", "Hayes"
        };
    }

    public void generateCategories() {
        // array size 30
        String[] categories = {
                "Arts & Photography",
                "Business & Money",
                "Comics, Manga & Graphic Novels",
                "Cookbooks, Food & Wine",
                "Education & Teaching",
                "Foreign Languages",
                "History",
                "Law",
                "Literature & Fiction",
                "Mystery, Thriller & Suspense",
                "Parenting & Relationships",
                "Reference",
                "Romance",
                "Science Fiction & Fantasy",
                "Sports & Outdoors",
                "Travel",
                "Biographies & Memoirs",
                "Children's eBooks",
                "Computers & Technology",
                "Crafts, Hobbies & Home",
                "Engineering & Transportation",
                "Health, Fitness & Dieting",
                "Humor & Entertainment",
                "Medical eBooks",
                "Nonfiction",
                "Politics & Social Sciences",
                "Religion & Spirituality",
                "Science & Math",
                "Self-Help",
                "Teen & Young Adult"
        };
    }

    public void generateBooks() {
        //(20, 20, 20, 8000)
        String[] adjectives = {
                "Forbidden", "Ancient", "Eternal", "Mystic", "Shadowy", "Divine",
                "Infinite", "Lost", "Forsaken", "Hidden", "Glorious", "Silent", "Reckless",
                "Brave", "Dark", "Golden", "Fallen", "Forgotten", "Bright", "Cursed"
        };

        String[] nouns = {
                "Kingdom", "Empire", "Secret", "Legacy", "Quest", "Journey",
                "Heart", "Shadow", "Light", "Night", "Day", "Twilight", "Dawn",
                "Eclipse", "Moon", "Sun", "Star", "Planet", "Galaxy", "Universe"
        };

        String[] suffixes = {
                "of the Ancients", "of the Forgotten", "of Eternity", "of Shadows",
                "of Light", "of Darkness", "beyond Time", "without End", "of Neverland",
                "of the New World", "of the Old Gods", "of the Lost", "of Fire and Ice",
                "of the Dragon", "of the Phoenix", "of Destiny", "of Fate", "of the Future",
                "of the Past", "of Dreams"
        };


    }

    public void generateBookDescriptions() {
        // (12, 14, 16, 2688)
        String[] beginnings = {"In a world where magic and mystery intertwine,",
                "Set against the backdrop of a war-torn kingdom,",
                "In the heart of an ancient forest shrouded in secrets,",
                "Amidst the chaos of a galaxy on the brink of destruction,",
                "Exploring the mysteries of a hidden society beneath the sea,",
                "In a time of ancient gods, warlords, and kings, a legend awakens,",
                "In the silent vacuum of space, a lone ship harbors a startling secret,",
                "Under the guise of a peaceful utopia, a society hides a dark underworld,",
                "Within the ruins of a civilization long forgotten, adventurers uncover a relic of untold power,",
                "Through the mists of an enchanted forest, a hidden path leads to realms unknown,",
                "Beyond the reaches of our known world, lies a land where magic flows as freely as water,",
                "In the depths of the urban jungle, a conspiracy threatens to unravel the fabric of society,"
        };
        String[] middles = {"a forbidden love blossoms against all odds. Amidst danger and betrayal,",
                "an unlikely hero rises, armed with a power they barely understand. With the fate of the world hanging in the balance,",
                "darkness threatens to consume everything, leaving nothing but ashes. Heroes and villains alike must choose their sides,",
                "an ancient secret is uncovered, promising power or doom. As alliances shift,",
                "destinies intertwine in a dance of fate and freewill. Caught in a web of lies,",
                "friendship is tested as never before, challenging beliefs and forging new bonds. Amidst trials,",
                "a journey of self-discovery begins, leading to the truth hidden within. Through pain and loss,",
                "rivalries lead to conflict, igniting a spark that could burn the world to the ground. In the shadow of impending doom,",
                "a lone detective confronts mysteries that defy logic. In the shadows,",
                "the discovery of an ancient artifact sets off a race against time. Surrounded by enemies,",
                "a rebellion takes shape, seeking to overturn centuries of oppression. At the heart of the uprising,",
                "an unexpected alliance forms, bridging worlds and cultures. Amidst conflict,",
                "the fabric of reality begins to fray, revealing glimpses of parallel universes. As worlds collide,",
                "a curse threatens to bring about an eternal night. Only a bond forged in destiny can break the spell,"
        };
        String[] ends = {"Can they survive the coming storm, or will their newfound love be lost forever?",
                "Will they find the courage within to face the darkness, or will they falter in the face of adversity?",
                "Is their bond strong enough to save the world, or will it crumble under the weight of their destiny?",
                "What will be the cost of their victory, and is it a price they are willing to pay?",
                "Can love triumph over evil, or will the shadows swallow them whole?",
                "Will they uncover the truth in time to change the course of history, or will they be mere pawns in a larger game?",
                "How will their choices shape the future, and can they live with the consequences?",
                "Can peace ever be restored, or will the world be forever changed by the battles waged?",
                "will the light of hope shine through the darkness, or will it be extinguished forever?",
                "are they prepared to make the ultimate sacrifice for the greater good, or will self-preservation prevail?",
                "can they forge a new future, or are they doomed to repeat the mistakes of the past?",
                "will the seeds of change planted today bloom into a better tomorrow, or will they wither and die?",
                "can a single voice of truth cut through the cacophony of lies, or will it be silenced?",
                "will the pursuit of knowledge lead to enlightenment, or will it open a Pandora's box of new horrors?",
                "can they bridge the chasm between worlds, or will the gap widen beyond repair?",
                "will the dawn of a new era bring peace, or will it herald an age of chaos?"
        };
    }
}
