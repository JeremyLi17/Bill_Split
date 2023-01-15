import styled from 'styled-components';
import CloseIcon from '@mui/icons-material/Close';
import { useState } from 'react';
import Select from 'react-select';

const Container = styled.div`
  width: 100%;
  height: 100%;
  position: absolute;
  top: 0;
  left: 0;
  background-color: #000000a7;
  display: flex;
  align-items: center;
  justify-content: center;
`;

const Wrapper = styled.div`
  width: 600px;
  height: 700px;
  background-color: whitesmoke;
  padding: 20px;
  display: flex;
  flex-direction: column;
  gap: 20px;
  position: relative;
`;

const Close = styled.div`
  position: absolute;
  top: 10px;
  right: 10px;
  cursor: pointer;
  font-weight: 500;
`;

const Title = styled.h1`
  padding-top: 20px;
  text-align: center;
`;

const Input = styled.input`
  border: 1px solid #6a6a6a;
  border-radius: 3px;
  padding: 10px;
  background-color: transparent;
`;

const Desc = styled.textarea`
  border: 1px solid #6a6a6a;
  border-radius: 3px;
  padding: 10px;
  background-color: transparent;
`;

const Button = styled.button`
  border-radius: 3px;
  border: none;
  padding: 10px 20px;
  font-weight: 500;
  cursor: pointer;
  background-color: #7fdbff;
`;

const Label = styled.label`
  font-size: 14px;
`;

const UploadAct = ({ setOpen }) => {
  const [members, setMember] = useState([]);

  const handleMultiSelect = (e) => {
    setMember(e.map((select) => select.label));
  };

  const options = [
    { value: 'john', label: 'John' },
    { value: 'alex', label: 'Alex' },
    { value: 'tony', label: 'Tony' },
  ];

  return (
    <Container>
      <Wrapper>
        <Close onClick={() => setOpen(false)}>
          <CloseIcon />
        </Close>
        <Title>Upload an Activity</Title>
        <Label>Activity Info:</Label>
        <Input type="text" placeholder="Activity Name" />
        <Input type="date" />
        <Desc placeholder="Description" rows={4} name="desc" />
        <Label>Payer:</Label>
        <Select type="text" options={options}></Select>
        <Input type="number" placeholder="payment amount" />
        <Label>All Members:</Label>
        <Select
          type="text"
          options={options}
          isMulti
          onChange={handleMultiSelect}
        ></Select>
        <Label>Comfirmed Selected Members: {members.toString()}</Label>
        <Button>Upload</Button>
      </Wrapper>
    </Container>
  );
};

export default UploadAct;
