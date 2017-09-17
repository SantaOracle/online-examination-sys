package online_examination_sys.controller;

import online_examination_sys.domain.dao.dto.TestDTO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/subject")
public class SubjectController {

    @RequestMapping(value = "/addSubject")
    @ResponseBody
    public TestDTO addSubject(
        @RequestParam(value = "title", required = true)String title,
        @RequestParam(value = "answerStr", required = true)String answerStr,
        @RequestParam(value = "answerIndex", required = true)int anserIndex
    ){
        TestDTO testDTO = new TestDTO();
        return testDTO;
    }

    public TestDTO updateSubject(
        @RequestParam(value = "id", required = true)int id,
        @RequestParam(value = "title", required = false)String title,
        @RequestParam(value = "answerStr", required = false)String answerStr,
        @RequestParam(value = "answerIndex", required = false)String answerIndex
    ){
        TestDTO testDTO = new TestDTO();
        return testDTO;
    }

}
