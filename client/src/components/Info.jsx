import styled from 'styled-components';
import EditOutlinedIcon from '@mui/icons-material/EditOutlined';

const Container = styled.div`
  display: flex;
  flex-direction: column;
  justify-items: center;
  position: relative;
  width: 100%;
`;

const Details = styled.div`
  margin-left: 50px;
  display: flex;
  flex-direction: column;
  align-items: center;
  width: 100%;
  gap: 10px;
`;

const DetailTital = styled.div`
  display: flex;
  flex-direction: row;
  font-size: 22px;
  width: 100%;
  align-items: baseline;
`;

const Detail = styled.span`
  margin-left: 10px;
  font-size: 18px;
`;

const Edit = styled.div`
  position: absolute;
  right: 60px;
  top: 35px;
  gap: 5px;
  display: flex;
  align-items: center;
  background-color: #e3e2e2;
  border-radius: 3px;
  padding: 2px 5px;
  cursor: pointer;
  font-weight: 400;
  font-size: 18px;
`;

const Info = () => {
  return (
    <Container>
      <Edit>
        <EditOutlinedIcon />
        Edit
      </Edit>
      <Details>
        <DetailTital>
          Username:<Detail>Jeremy</Detail>
        </DetailTital>
        <DetailTital>
          Email:<Detail>test@gmail.com</Detail>
        </DetailTital>
        <DetailTital>
          Phone Number:<Detail>+1234567890</Detail>
        </DetailTital>
      </Details>
    </Container>
  );
};

export default Info;
