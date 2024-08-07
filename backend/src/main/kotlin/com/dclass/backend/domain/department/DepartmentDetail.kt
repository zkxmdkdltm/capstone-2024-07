package com.dclass.backend.domain.department

enum class DepartmentDetail(
    val title: String,
) {
    LanguageInformatics("언어정보학과"),
    KoreanLanguageLiterature("국어국문학과"),
    GermanLanguageLiterature("독어독문학과"),
    RussianLanguageLiterature("노어노문학과"),
    EnglishLanguageLiterature("영어영문학과"),
    JapaneseLanguageLiterature("일어일문학과"),
    ChineseLanguageLiterature("중어중문학과"),
    FrenchLanguageLiterature("불어불문학과"),
    SpanishLanguageLiterature("서어서문학과"),
    NorthKoreanStudies("북한학과"),
    Philosophy("철학과"),
    History("사학과"),
    CulturalAnthropology("문화인류학과"),
    CreativeWriting("문예창작학과"),
    LibraryInformationScience("문헌정보학과"),
    Tourism("관광학과"),
    ClassicalChinese("한문학과"),
    Theology("신학과"),
    BuddhistStudies("불교학과"),
    IndependentMajor("자율전공학과"),

    BusinessAdministration("경영학과"),
    Economics("경제학과"),
    ManagementInformationSystems("경영정보학과"),
    InternationalTrade("국제통상학과"),
    AdvertisingPublicRelations("광고홍보학과"),
    Finance("금융학과"),
    Accounting("회계학과"),
    Taxation("세무학과"),
    Psychology("심리학과"),
    Law("법학과"),
    Sociology("사회학과"),
    UrbanStudies("도시학과"),
    PoliticalDiplomacy("정치외교학과"),
    InternationalStudies("국제학과"),
    SocialWelfare("사회복지학과"),
    MediaCommunication("미디어커뮤니케이션학과"),
    Geography("지리학과"),
    PublicAdministration("행정학과"),
    MilitaryScience("군사학과"),
    PoliceAdministration("경찰행정학과"),
    ChildFamilyStudies("아동가족학과"),
    ConsumerStudies("소비자학과"),
    Logistics("물류학과"),
    Trade("무역학과"),
    HotelManagement("호텔경영학과"),

    HomeEducation("가정교육과"),
    ConstructionEngineeringEducation("건설공학교육과"),
    ScienceEducation("과학교육과"),
    ElectricalElectronicsTelecommunicationEngineeringEducation("전기전자통신공학교육과"),
    MaterialsEngineeringEducation("기계재료공학교육과"),
    TechnologyEducation("기술교육과"),
    AgriculturalEducation("농업교육과"),
    PhysicsEducation("물리교육과"),
    ArtEducation("미술교육과"),
    SocialEducation("사회교육과"),
    BiologyEducation("생물교육과"),
    MathematicsEducation("수학교육과"),
    AquaticMarineIndustryEducation("수해양산업교육과"),
    ChildEducation("아동교육과"),
    SpeechTherapy("언어치료학과"),
    LanguageEducation("언어교육학과"),
    HistoryEducation("역사교육과"),
    MusicEducation("음악교육과"),
    EthicsEducation("윤리교육과"),
    ReligiousEducation("종교교육과"),
    EarthScienceEducation("지구과학교육과"),
    GeographyEducation("지리교육과"),
    PhysicalEducation("체육교육과"),
    ElementaryEducation("초등교육과"),
    ComputerEducation("컴퓨터교육과"),
    SpecialEducation("특수교육과"),
    ClassicalChineseEducation("한문교육과"),
    ChemistryEducation("화학교육과"),
    EnvironmentalEducation("환경교육과"),

    ComputerScience("컴퓨터공학과"),
    ShipbuildingEngineering("조선공학과"),
    IndustrialEngineering("산업공학과"),
    MultimediaStudies("멀티미디어학과"),
    GameEngineering("게임공학과"),
    MediaPublishing("미디어출판과"),
    MaterialsEngineering("재료공학과"),
    Cosmetics("화장품과"),
    Architecture("건축학과"),
    LogisticsSystemsEngineering("물류시스템공학과"),
    MarineEngineering("해양공학과"),
    PolymerEngineering("고분자공학과"),
    OpticalEngineering("광학공학과"),
    TrafficEngineering("교통공학과"),
    DefenseTechnology("국방기술학과"),
    MetallurgicalEngineering("금속공학과"),
    MoldDesign("금형설계과"),
    MechanicalEngineering("기계공학과"),
    NanoEngineering("나노공학과"),
    RefrigerationAirConditioningEngineering("냉동공조공학과"),
    UrbanEngineering("도시공학과"),
    RoboticsEngineering("로봇공학과"),
    UnmannedAviation("무인항공학과"),
    SemiconductorStudies("반도체과"),
    IndustrialFacilityAutomation("산업설비자동화과"),
    TextileStudies("섬유과"),
    CeramicEngineering("세라믹공학과"),
    FireProtection("소방방재학과"),
    SystemsEngineering("시스템공학과"),
    NewMaterialsEngineering("신소재공학과"),
    RenewableEnergy("신재생에너지과"),
    SafetyEngineering("안전공학과"),
    EnergyResourcesEngineering("에너지자원공학과"),
    NuclearEngineering("원자력공학과"),
    AutomotiveEngineering("자동차과"),
    ElectricalEngineering("전기공학과"),
    ElectronicsEngineering("전자공학과"),
    InformationSecurity("정보보호학과"),
    ControlMeasurementEngineering("제어계측공학과"),
    PaperEngineering("제지공학과"),
    LandscapeArchitecture("조경과"),
    EarthMarineScience("지구해양과학과"),
    RailwayTransportation("철도교통과"),
    SurveyingInformation("측지정보과"),
    CivilEngineering("토목공학과"),
    SpecialEquipment("특수장비과"),
    AerospaceEngineering("항공공학과"),
    ChemicalEngineering("화학공학과"),
    EnvironmentalChemistry("환경화학과"),

    LifeSciences("생명공학과"),
    CulinaryArts("조리학과"),
    Horticulture("원예과"),
    AgricultureFisheries("농수산과"),
    EnvironmentalEngineering("환경공학과"),
    Zoology("동물학과"),
    PharmaceuticalEngineering("제약공학과"),
    FoodScience("식품학과"),
    VeterinaryMedicine("수의학과"),
    Astronomy("천문학과"),
    Physics("물리학과"),
    Mathematics("수학과"),
    Chemistry("화학과"),
    Clothing("의류학과"),
    ForestEngineering("임산공학"),
    Geology("지질학과"),
    Geography2("지리학과(자연)"),

    Medicine("의예과"),
    Nursing("간호학과"),
    Pharmacy("약학과"),
    Dentistry("치의학과"),
    PhysicalTherapy("물리치료학과"),
    KoreanMedicine("한의예과"),
    EnvironmentalHealth("환경보건학과"),
    EmergencyMedicalTechnology("응급구조학과"),
    MedicalAdministration("의무행정과"),
    MedicalEquipmentEngineering("의료장비공학과"),
    ClinicalPathology("임상병리학과"),
    Radiology("방사선과"),
    FireSafetyManagement("소방안전관리과"),
    ArtTherapy("예술치료학과"),
    SpeechRehabilitation("언어재활과"),

    FineArts("순수미술과"),
    AppliedArts("응용미술과"),
    Sculpture("조형과"),
    Crafts("공예과"),
    IndustrialDesign("공업디자인과"),
    GraphicDesign("그래픽디자인과"),
    MediaFilmStudies("미디어영상학과"),
    Animation("애니메이션과"),
    InstrumentalMusic("기악과"),
    VocalMusic("성악과"),
    Music("음악과"),
    PracticalMusic("실용음악과"),
    DramaFilm("연극영화과"),
    FashionDesign("패션디자인과"),
    InteriorDesign("실내디자인과"),
    AdvertisingDesign("광고디자인과"),
    DanceSports("댄스스포츠과"),
    SocialSports("사회체육과"),
    SecurityStudies("경호학과"),
    HealthCare("건강관리과"),
    MakeupArtistry("메이크업아티스트과"),
    Modeling("모델과"),
    Gemology("보석감정과"),
    CommercialDiving("산업잠수과"),

    NOT_SELECTED(""),
    ;

    companion object {
        fun findByTitle(title: String): DepartmentDetail {
            return entries.find { it.title == title } ?: NOT_SELECTED
        }
    }
}
