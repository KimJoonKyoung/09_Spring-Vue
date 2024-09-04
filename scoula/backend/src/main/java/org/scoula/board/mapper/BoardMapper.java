package org.scoula.board.mapper;

import org.apache.ibatis.annotations.Select;
import org.scoula.board.domain.BoardAttachmentVO;
import org.scoula.board.domain.BoardVO;
import org.scoula.pagination.PageRequest;

import java.util.List;

public interface BoardMapper {
    int getTotalCount();

    List<BoardVO> getPage(PageRequest pageRequest);

    //    @Select("select * from tbl_board order by no desc")
    List<BoardVO> getList();

    BoardVO get(Long no);

    void create(BoardVO board);

    int update(BoardVO board);
    int delete(Long no);



    void createAttachment(BoardAttachmentVO attch);

    List<BoardAttachmentVO> getAttachmentList(Long bno);

    BoardAttachmentVO getAttachment(Long No);
    int deleteAttachment(Long no);;
}



